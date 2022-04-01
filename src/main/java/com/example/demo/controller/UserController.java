package com.example.demo.controller;

import com.example.demo.model.Comedian;
import com.example.demo.repository.ComediansRepo;
import com.example.demo.service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/")
@RestController
public class UserController {

  @Autowired
  private EmailSender emailSender;

  @Autowired
  private ComediansRepo comediansRepo;

  @GetMapping("/")
  public ResponseEntity<String> send() throws IOException, MessagingException {
    String msg = "<html>\n" + "<body>\n" + "\n" + "<h2>Select your favorite comedian</h2>\n" + "\n"
      + "<a href=\"http://localhost:8090/cafe/rs/v1/\">click here for comedians</a>\n"
      + "</body>\n" + "</html>";
    emailSender.sendMail(new ArrayList(List.of("ap97229@gmail.com")),"comedycafe",msg);
    return ResponseEntity.ok("success");
  }

  @GetMapping(value="/comedians", produces="application/json")
  public ResponseEntity<Iterable<Comedian>> getComedians(){
    Iterable<Comedian> response = comediansRepo.findAll();
    return new ResponseEntity(response, HttpStatus.OK);
  }
}
