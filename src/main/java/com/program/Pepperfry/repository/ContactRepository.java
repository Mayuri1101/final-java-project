package com.program.Pepperfry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.Pepperfry.entity.ContactData;



public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
