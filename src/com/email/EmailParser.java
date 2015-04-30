package com.email;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import javax.mail.Header;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

public class EmailParser {

	public static void main(String args[])
	{
		File emailFile=new File("D:\\testmail.htm");

		Session mailSession = Session.getDefaultInstance(new Properties());

		try {

		InputStream source = new FileInputStream( emailFile);

		MimeMessage message = new MimeMessage(mailSession, source);
		
		System.out.println("Subject : " + message.getSubject());

//		System.out.println("From : " + message.getFrom()[0]);

		System.out.println("————–");

		System.out.println("Body : " +  message.getContent());
		
		
		
		
		
	/*	message.getAllHeaderLines();
		for (Enumeration<Header> e = message.getAllHeaders(); e.hasMoreElements();) {
		    Header h = e.nextElement();
		    System.out.println("Name   :"+h.getName());
		    System.out.println("value   :"+h.getValue());
		}
*/
		} catch (MessagingException e) {
		// TODO Auto-generated catch block

		e.printStackTrace();

		} catch (FileNotFoundException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		} catch (IOException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}
	}
}
