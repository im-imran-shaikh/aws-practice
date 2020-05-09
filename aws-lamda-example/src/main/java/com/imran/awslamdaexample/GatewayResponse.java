package com.imran.awslamdaexample;

import java.util.Map;

public class GatewayResponse
{
	private String body;
	private Integer statuscode;
	private Map<String, String> headers;
	private boolean isBase64Encoded;
	public GatewayResponse(String body, Integer statuscode, Map<String, String> headers, boolean isBase64Encoded)
	{
		super();
		this.body = body;
		this.statuscode = statuscode;
		this.headers = headers;
		this.isBase64Encoded = isBase64Encoded;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody(String body)
	{
		this.body = body;
	}
	public Integer getStatuscode()
	{
		return statuscode;
	}
	public void setStatuscode(Integer statuscode)
	{
		this.statuscode = statuscode;
	}
	public Map<String, String> getHeaders()
	{
		return headers;
	}
	public void setHeaders(Map<String, String> headers)
	{
		this.headers = headers;
	}
	public boolean isBase64Encoded()
	{
		return isBase64Encoded;
	}
	public void setBase64Encoded(boolean isBase64Encoded)
	{
		this.isBase64Encoded = isBase64Encoded;
	}
	
	

}
