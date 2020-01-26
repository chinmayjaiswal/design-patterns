package com.cj.design.pattern.builder;

public class RestRequest {
	private String url;
	private String httpMethod;

	private RestRequest(RequestBuilder builder) {
		this.url = builder.url;
		this.httpMethod = builder.method;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public String getUrl() {
		return url;
	}

	public static class RequestBuilder {
		private String url;

		private String method = "GET";

		public RequestBuilder get(String url) {
			this.url = url;
			this.method = "GET";
			return this;
		}

		public RequestBuilder post(String url) {
			this.url = url;
			this.method = "POST";
			return this;
		}

		public RestRequest build() {
			return new RestRequest(this);
		}

		@Override
		public String toString() {
			return "Builder [url=" + url + ", method=" + method + "]";
		}

	}

	@Override
	public String toString() {
		return "RestRequest [url=" + url + ", httpMethod=" + httpMethod + "]";
	}

}
