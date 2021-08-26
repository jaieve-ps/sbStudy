package com.study.hsy.controller;

import com.study.hsy.model.Person;
import com.study.hsy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/api")
@RestController // 모든 맵핑이 리스판스바디로 적용된다 = object to json
public class ApiController {

    @Autowired
    PersonService personService;

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setUserName("seoyeon");
        person.setUserEmail("yoori0303@naver.com");
        person.setIntroduce("기계가 사람을 대체할지도 모른다는 공포감이 점점 커져가면서 대체될 수 없는 존재가 되고 싶어서 '식품생명공학' 전공에서 IT 개발 직군으로 전향한 비전공자입니다.");
        person.setFavQuote("<strong>내가 하려고 하는 것은 단지 전진하고 발전하는 것이다.</strong>\n" + "Julian Hatfield");

        return person;
    }

    @GetMapping("/users")
    public List<Person> getPersons(){
        System.out.println(personService.findAll());

        return personService.findAll();
    }


}
