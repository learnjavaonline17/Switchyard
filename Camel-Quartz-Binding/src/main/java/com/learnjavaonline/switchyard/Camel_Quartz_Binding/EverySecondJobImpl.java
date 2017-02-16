package com.learnjavaonline.switchyard.Camel_Quartz_Binding;

import org.switchyard.component.bean.Service;

@Service(EverySecondJob.class)
public class EverySecondJobImpl implements EverySecondJob {

	private int timer;
	@Override
	public void counter() {

		System.out.println("The counter Hites -"+timer++);
	}

}
