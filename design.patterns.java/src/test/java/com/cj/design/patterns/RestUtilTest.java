package com.cj.design.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cj.design.pattern.builder.RestRequest;
import com.cj.design.pattern.builder.RestUtil;

public class RestUtilTest {

	@Test
	public void test() {
		RestUtil restUtil = new RestUtil();
		int responseCode = restUtil.executeRestRequest(
				new RestRequest.RequestBuilder().get("http://dummy.restapiexample.com/api/v1/employees").build());
		assertEquals(200, responseCode);
		responseCode = restUtil
				.executeRestRequest(new RestRequest.RequestBuilder().get("http://localhost:8080/").build());
		assertEquals(200, responseCode);
	}
}
