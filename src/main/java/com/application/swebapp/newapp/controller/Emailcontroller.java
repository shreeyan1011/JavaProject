package com.application.swebapp.newapp.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.application.swebapp.newapp.model.User;

@Controller
public class Emailcontroller {

	@GetMapping("/forgotpswd")
	public String sendmail(User user) {

		return "forgotpswd";
	}

	@PostMapping("/forgotpswd")
	public String processForm(User user) throws AddressException, MessagingException, IOException {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("demomailbyshreeya@gmail.com", "demo@555");
			}
		});
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("demomailbyshreeya@gmail.com", false));

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmail()));
		msg.setSubject("Reset Password mail");
		msg.setContent("<h3>Hi, Use the link below to reset your password:</h3>"
				+ "<a href=\"http://localhost:8080/resetpswd.html\">Reset</a>", "text/html");
		msg.setSentDate(new Date());
		Transport.send(msg);
		return "changepswd";
	}
}
