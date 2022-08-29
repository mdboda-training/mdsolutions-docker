package com.mdsolutions.naming.server;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestReq {

	public static void main(String[] args) throws IOException {
		
		try {
			URL url = new URL("http://localhost:8088/circuit-breaker");
			
			for(int i=0;i<100000;i++) {
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				System.out.println(i+"  "+con.getResponseCode());
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
