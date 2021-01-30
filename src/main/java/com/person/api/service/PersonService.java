package com.person.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.api.dto.PersonDTO;
import com.person.api.dto.response.MessageResponseDTO;
import com.person.api.entity.Person;
import com.person.api.exception.PersonNotFoundException;
import com.person.api.mapper.PersonMapper;
import com.person.api.repository.PersonRepository;

/***
 * 
 * @author dionatan
 *
 */

@Service
public class PersonService {

	private PersonRepository personRepository;
	
	private final PersonMapper personMapper = PersonMapper.INSTANCE;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		Person personToSave = personMapper.toModel(personDTO);
		Person savedPerson = personRepository.save(personToSave);
		return MessageResponseDTO.builder()
				.message("Created person with ID " + savedPerson.getId())
				.build();
	}

	public List<PersonDTO> listAll() {
		List<Person> allPeople = personRepository.findAll();
		return allPeople.stream()
				.map(personMapper::toDTO)
				.collect(Collectors.toList());
	}

	public PersonDTO findById(Long id) throws PersonNotFoundException {
		Person person = personRepository.findById(id)
			.orElseThrow(() -> new PersonNotFoundException(id));
		
		return personMapper.toDTO(person);
	}
}
