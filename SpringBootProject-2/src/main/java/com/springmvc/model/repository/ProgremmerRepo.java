package com.springmvc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Programmer;

@Repository
public interface ProgremmerRepo extends JpaRepository<Programmer, Integer>{

}
