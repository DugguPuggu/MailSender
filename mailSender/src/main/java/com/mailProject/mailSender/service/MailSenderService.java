package com.mailProject.mailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class MailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String receiverEmail, String subject, String body){
        SimpleMailMessage message = new SimpleMailMessage();
        String senderEmail = "dpbehera1997@gmail.com";
        message.setFrom(senderEmail);
        message.setTo(receiverEmail);
        message.setSubject(subject);
        message.setText(body);
        javaMailSender.send(message);
        System.out.println("Mail sent successfully");
    }
}
