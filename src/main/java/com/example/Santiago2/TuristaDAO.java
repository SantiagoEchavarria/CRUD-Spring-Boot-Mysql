package com.example.Santiago2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuristaDAO extends JpaRepository<Turista, Integer>{

}