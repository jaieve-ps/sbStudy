package com.study.hsy;

import com.study.hsy.model.Person;
import com.study.hsy.service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HsyApplicationTests {

	@Autowired
	PersonService personService;

	@Test
	void contextLoads() {
	}

	@Test
	void test1() {
		List<Person> personList = personService.findAll();
		for(Person person: personList){
			System.out.println("person : " + person.getUserName());
		}
	}

}
