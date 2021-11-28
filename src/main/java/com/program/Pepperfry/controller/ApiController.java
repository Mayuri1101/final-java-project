package com.program.Pepperfry.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.Pepperfry.entity.UserData;
import com.program.Pepperfry.repository.UserRepository;


@RestController
@RequestMapping("/reg")

public class ApiController {
@Autowired
UserRepository ss;
@GetMapping("/data")
public List<UserData>get(){
return ss.findAll();
}
}

   
