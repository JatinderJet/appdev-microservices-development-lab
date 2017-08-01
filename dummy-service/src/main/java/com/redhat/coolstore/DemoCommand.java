package com.redhat.coolstore;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;


public class DemoCommand extends HystrixCommand<String> {

   static final HystrixCommandKey KEY = HystrixCommandKey.Factory.asKey(DemoCommand.class.getSimpleName());

   static final HystrixCommandGroupKey GROUP_KEY = HystrixCommandGroupKey.Factory.asKey(DemoCommand.class.getPackage().getName());

   private final Client client;
   
   DemoCommand(Client client) {
       super(Setter.withGroupKey(GROUP_KEY).andCommandKey(KEY));
       this.client= client;
   }

   @Override
   protected String run() throws Exception {
	   
	  // return "Hello " + name + "!";
	   // TODO externalise the URL, works for oc project myproject
       Response response = client.target("http://inventory-service-myproject.192.168.0.20.xip.io/api/availability/444435").request(MediaType.APPLICATION_JSON).get();
       try {
           if (response.getStatus() != 200) {
               throw new RuntimeException("Cannot get inventory details" );
           }
           String value = response.readEntity(String.class);
           return value;
       } finally {
           response.close();
       }
   }

   @Override
   protected String getFallback() {
	   // Can return generalised object from here
       return "Fallback";
   }

   
   
   public static void main(String[] args){
	   Client client = ClientBuilder.newBuilder().build();
	   System.out.println(new DemoCommand(client).execute());
   }

}
