package com.program.Pepperfry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.Pepperfry.entity.CheckoutData;


public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
