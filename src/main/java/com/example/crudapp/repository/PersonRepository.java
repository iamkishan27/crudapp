package com.example.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudapp.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
