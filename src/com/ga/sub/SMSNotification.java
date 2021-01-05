package com.ga.sub;

public class SMSNotification implements Notification {

	//const. is created by default with empty parameters 
	
	@Override
	public void notifyUser() {
		System.out.println("This is an SMS notification");
	}
}
