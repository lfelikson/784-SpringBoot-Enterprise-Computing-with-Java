package com.example.myfirstapp.service;

public class EmailServiceImpl implements NotificationService {

	@Override
	public void notify (String msg, String dest) {
		System.out.println("Email sent to " + dest + " with Message=" + msg);
	}

}
