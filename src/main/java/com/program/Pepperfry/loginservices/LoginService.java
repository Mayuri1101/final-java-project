package com.program.Pepperfry.loginservices;

import org.springframework.stereotype.Service;

import com.program.Pepperfry.logindomain.Login;
import com.program.Pepperfry.loginrepository.loginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

 
 
 
@Service
public class LoginService {
@Autowired
private loginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
   return user;
  }
 
}
