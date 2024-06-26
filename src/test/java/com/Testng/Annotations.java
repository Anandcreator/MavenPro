package com.Testng;

import org.testng.annotations.Test;

public class Annotations {
@Test
	private void getUrl() {
		System.out.println("get url");
	}
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	private void setProperty() {
		System.out.println("Set Property");
	}
	private void login() {
		System.out.println("Log in");
	}
}