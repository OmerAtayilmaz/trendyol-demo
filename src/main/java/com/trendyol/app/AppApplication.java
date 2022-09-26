package com.trendyol.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		// OLD-SCHOOL STYLE
		try {
			URL url = new URL("https://api.publicapis.org/entries");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			System.out.println(con.getRequestMethod());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		SpringApplication.run(AppApplication.class, args);
	}

}
