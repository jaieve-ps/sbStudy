package com.study.hsy.controller.api;

import com.study.hsy.model.Experience;
import com.study.hsy.model.Link;
import com.study.hsy.model.Person;
import com.study.hsy.model.Skill;
import com.study.hsy.service.ExperienceService;
import com.study.hsy.service.LinkService;
import com.study.hsy.service.PersonService;
import com.study.hsy.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequestMapping("/api")
@RestController // 모든 맵핑이 리스판스바디로 적용된다 = object to json 각 함수에 @ResponseBody 안붙여줘도 됨.
public class ApiController {

    @Autowired
    PersonService personService;
    @Autowired
    LinkService linkService;
    @Autowired
    SkillService skillService;
    @Autowired
    ExperienceService experienceService;

    @GetMapping("/person")
    public Person getPerson(@RequestParam Long id) {
        return personService.getPerson(id);
    }

    @GetMapping("/personList")
    public List<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("/link")
    public Map<Long, List<Link>> getLinkList(){
        // List -> Map
        List<Link> linkList =linkService.getLinkList();
        Map<Long, List<Link>> linkMap = linkList.stream().collect(Collectors.groupingBy(Link::getId));
        return linkMap;
    }

    @GetMapping("/skillList")
    public List<Skill> getSkillMap() {
        return skillService.getSkillList();
    }

    @GetMapping("/expList")
    public List<Experience> getExpList() { return experienceService.getExpList(); }

    // 예제
    @GetMapping("/{ids}")
    public void getVar(Model model, @PathVariable(name="ids") Long id){

    }
}
