package com.person.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.api.entity.Person;

/***
 * 
 * @author dionatan
 *
 */

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
