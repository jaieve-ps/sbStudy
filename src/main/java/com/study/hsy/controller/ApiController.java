package com.study.hsy.controller;

import com.study.hsy.model.Link;
import com.study.hsy.model.Person;
import com.study.hsy.service.LinkService;
import com.study.hsy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public Map<String, Map<String, String>> getSkillMap() {
        Map<String, Map<String, String>> skillMap = new HashMap<String, Map<String, String>>();
        Map<String, String> skillContent = new HashMap<String, String>();
        skillContent.put("stack", "pringBoots Framework / JSP, JPA / Java");
        skillContent.put("tool", "Eclipse, IntelliJ<br/>연결DB: Oracle, MySQL, H2, MS-SQL<br/>");
        skillContent.put("detail", "프로젝트 개발을 위해 Spring 기반의 환경 구축하고 maven 및 gradle 프레임워크 사용");
        skillMap.put("Back-end", skillContent);
        skillContent.clear();

        skillContent.put("stack", "Oracle, MySQL, MSSQL, PostgreSQL, SQLite");
        skillContent.put("tool", "DBeaver, MySQL Workbench, Oracle SQLdeveloper<br/>");
        skillContent.put("detail", "JSP의 JDBC, Spring의 Mybatis와 연계하여 DB를 이용해보았으며, DB 환경설정 및 구축을 해보며 스키마 생성, 함수, 제약조건 등 sub-query에 대한 기본 지식 갖춤");
        skillMap.put("Database", skillContent);
        skillContent.clear();

        skillContent.put("stack", "Python, Pandas etc.");
        skillContent.put("tool", "Pycharm, Jupyter Notebook<br/>");
        skillContent.put("detail", "Anaconda Jupyter Notebook을 이용하여 크롤링(BeautifulSoup4, requests, lxml, selenium)과 데이터 분석(numpy, pandas, matplotlib, seaborn) 시 사용되는 라이브러리 활용 가능 데이터를 수집하여 EDA 실행 후 시각화도구를 사용. 데이터에 대한 이해도를 바탕으로 분석모델을 설계하고 검증");
        skillMap.put("Machine Learning", skillContent);
        skillContent.clear();

        skillContent.put("stack", "HTML, CSS, VanilaJS");
        skillContent.put("tool", "VScode, Atom<br/>");
        skillContent.put("detail", "'카카오톡' 클론코딩을 통해 HTML, CSS, JavaScript의 활용방법을 익히고 Bootstrap을 사용할 줄 알며 개인프로젝트로 Spring MVC 프로젝트 진행 시 JSP에 JQuery, Ajax, json을 이용했으며 Bootstrap을 활용");
        skillMap.put("Front-end", skillContent);

        return skillMap;
    }

    // 예제
    @GetMapping("/{ids}")
    public void getVar(Model model, @PathVariable(name="ids") Long id){

    }
}
