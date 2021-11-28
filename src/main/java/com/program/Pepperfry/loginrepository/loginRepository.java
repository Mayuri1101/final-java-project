package com.program.Pepperfry.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.Pepperfry.logindomain.Login;



public interface loginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
