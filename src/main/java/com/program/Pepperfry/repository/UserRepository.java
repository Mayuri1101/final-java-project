package com.program.Pepperfry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.Pepperfry.entity.UserData;



public interface UserRepository extends JpaRepository<UserData, Integer> {

}
