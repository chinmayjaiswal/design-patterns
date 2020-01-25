package com.cj.design.patterns;

import org.junit.Test;

import com.cj.design.pattern.builder.RestRequestCaller;
import com.cj.design.pattern.builder.RestRequestCaller.RestCallBuilder;

public class RestRequestCallerTest {

	@Test
	public void test()
	{
		//RestCallBuilder restCallBuilder = new RestRequestCaller.RestCallBuilder("","");
		new RestRequestCaller.RestCallBuilder("GET","/folders/folders").call();
	}
}
