package com.mail.demo.events;

import com.mail.demo.service.EmailSenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class IncomingMails {

    @Autowired
    private EmailSenderService emailSenderService;
    private Logger logger = LoggerFactory.getLogger(IncomingMails.class);

    @Scheduled(fixedDelay = 100)
    public void checkForIncomingMails() {
        //logger.info("testing.....");
        //emailSenderService.readIncomingMails();
    }
}
