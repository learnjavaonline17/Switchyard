package com.learnjavaonline.switchyard.Hello_switchyard;

import org.switchyard.component.bean.Service;

@Service(HelloWorld.class)
public class HelloWorldBean implements HelloWorld {

	@Override
	public String sayHello(String name) {

		
		return "Hello "+name;
	}

}
