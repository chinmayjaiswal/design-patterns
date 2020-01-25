package com.cj.design.pattern.builder;

public class RestRequestCaller {

	public void invokeRestApi(RestCallBuilder builder) {
		System.out.println("Invoking Rest api with these details [ " + builder.method + ", " + builder.url + ", "
				+ builder.responseClass + "]");

	}

	public static class RestCallBuilder {
		private String url;
		private String method = "GET";
		
		@SuppressWarnings("rawtypes")
		private Class responseClass;

		public RestCallBuilder(String method, String url) {
			this.method = method;
			this.url = url;
		}

		@SuppressWarnings("rawtypes")
		public RestCallBuilder responseClass(Class responseClass) {
			this.responseClass = responseClass;
			return this;
		}

		public void call() {
			RestRequestCaller requestCaller = new RestRequestCaller();
			requestCaller.invokeRestApi(this);
		}

		@Override
		public String toString() {
			return "RestCallBuilder [url=" + url + ", method=" + method + ", responseClass=" + responseClass + "]";
		}

	}

}
