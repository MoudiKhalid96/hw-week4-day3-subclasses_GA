package com.ga.sub;

public class Main {

	public static void main(String[] args) {
		//create an object from sms and email notification classes 
		SMSNotification sms = new SMSNotification();
		EmailNotification email = new EmailNotification();
		
		//call the notification method
		sms.notifyUser();
		email.notifyUser();
	}
}
