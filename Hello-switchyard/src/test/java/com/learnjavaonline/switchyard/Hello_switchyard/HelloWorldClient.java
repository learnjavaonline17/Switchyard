package com.learnjavaonline.switchyard.Hello_switchyard;

import java.io.IOException;

import javax.xml.namespace.QName;

import org.switchyard.remote.RemoteInvoker;
import org.switchyard.remote.RemoteMessage;
import org.switchyard.remote.http.HttpInvoker;

public class HelloWorldClient {

	private static QName qname=new QName("urn:com.learnjavaonline.switchyard:Hello-switchyard:1.0", "HelloWorld");
	private static String  url="http://localhost:8080/switchyard-remote";
	public static void main(String[] args) throws Exception {

		RemoteInvoker invoker=new HttpInvoker(url);
		RemoteMessage request=new RemoteMessage();
		request.setService(qname).setOperation("sayHello").setContent("India");
		
		RemoteMessage response=invoker.invoke(request);		
		if(response.isFault()){
			System.err.println("Error"+response.getContent());
		}
		else
		{
			System.out.println("Respone is"+response.getContent());
		}
		
		
	}

}
