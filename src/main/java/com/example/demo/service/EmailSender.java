package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

@Service
public class EmailSender {

//  @Value("${email}")
//  private String mailFrom;

//  @Value("${password}")
//  private String password;

  @Autowired
  private JavaMailSender javaMailSender;

  @Value("${spring.mail.from}")
  private String mailFrom;

//  private static final XLogger LOG = XLoggerFactory.getXLogger(MailService.class);

  /**
   * Method to set the email template params for REST API call mail service.
   *
   * @param toMail
   * @param subject
   * @param message
   */
  public void sendMail(ArrayList<String> toMail, String subject, String message) {
//    LOG.entry("@Mail Service Call ");
    try {
      MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//      LOG.info("Mail Service Template Subject: {} ", subject);
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

      helper.setSubject(subject);
      helper.setText(message, true);
      helper.setFrom(mailFrom);
      helper.setTo(toMail.toArray(new String[toMail.size()]));
      javaMailSender.send(mimeMessage);
    }catch(MessagingException exception){
//      throw LOG.throwing(new C360RuntimeException("Invalid Address MIME exception {}", exception));
    }
//    LOG.exit();
  }


  //  public void sendmail() throws AddressException, MessagingException, IOException {
//
//  }
}
