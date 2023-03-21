package com.groupeisi.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailImpl {

	public boolean sendEmail(String to, String subject, String text) {
		  	boolean flag = false;
		  	final String username = "traoreharouna04@gmail.com";
	        final String password = "gaxssstmtnhgqdod";
	        
	        Properties properties = System.getProperties();
	        properties.put("mail.smtp.host", "smtp.gmail.com");
	        properties.put("mail.smtp.port", "465");
	        properties.put("mail.smtp.ssl.enable", "true");
	        properties.put("mail.smtp.auth", "true");
	        

	       
	        
	        
	        //session
	        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });
	        
	     // Used to debug SMTP issues
	        session.setDebug(true);
	        try {

	        	MimeMessage message = new MimeMessage(session);
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            message.setFrom(new InternetAddress(username));
	            message.setSubject(subject);
	            message.setText(text);
	            Transport.send(message);
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


		 
		return flag;
	}

}