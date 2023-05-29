package com.example.emailusingspring;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailUsingSpringApplication {

    @Autowired
    private EmailSenderService emailSenderService;

    public static void main(String[] args) {
        SpringApplication.run(EmailUsingSpringApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void triggerEmail() throws MessagingException {
        emailSenderService.sendMailWithAttachment("aarti.dhumal@coditas.com",
                "This is a demo from Spring boot sent by Aryaman. Also check the attachment which I have added using Spring boot. This is the SRS document of our project.",
                "Spring Boot Email by Aryaman and Sujan",
                "D:/Coditas/Software Requirement Specification.docx","sujan.shaikh@coditas.com");


    }
}
