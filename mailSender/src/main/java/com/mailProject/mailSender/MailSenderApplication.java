package com.mailProject.mailSender;

import com.mailProject.mailSender.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSenderApplication {

	@Autowired
	private MailSenderService mailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		mailSenderService.sendMail("dpbehera1998@gmail.com",
				"Auto generated mail",
				"hiii, there. How are you");
	}

}
