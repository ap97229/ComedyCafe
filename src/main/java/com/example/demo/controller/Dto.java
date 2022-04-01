package com.example.demo.controller;

import com.example.demo.model.Comedian;
import lombok.Value;

import java.util.List;

@Value
public class Dto {
  List<Comedian> comedians;
}
