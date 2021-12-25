package com.program.Pepperfry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.Pepperfry.entity.CheckoutData;
import com.program.Pepperfry.entity.UserData;
import com.program.Pepperfry.repository.CheckRepository;
import com.program.Pepperfry.repository.UserRepository;

//to get the data from database in json format
@RestController
@RequestMapping("/reg")

public class ApiController {
@Autowired
UserRepository ss;
@Autowired
CheckRepository cr;
@GetMapping("/data")
public List<UserData>get(){
return ss.findAll();
}
//add data to the database
@PostMapping("/users")
public UserData sign(@RequestBody UserData sign) {
	return ss.save(sign);
}
//update the data
@PutMapping("/users")
public UserData sign1(@RequestBody UserData sign) {
	return ss.save(sign);
}

@GetMapping("/check")
public List<CheckoutData> show() {
	return cr.findAll();
}

@GetMapping("/check/{id}")
public Optional<CheckoutData> showId(@PathVariable Integer id) {
	return cr.findById(id);
}
}

   
