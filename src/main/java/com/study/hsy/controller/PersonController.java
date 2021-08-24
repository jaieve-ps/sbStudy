package com.study.hsy.controller;

import com.study.hsy.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/polestar") // 공통url 설정
public class PersonController {



    @GetMapping
    public String getUserinfo(Model model) {
        Person person = new Person();
        person.setUserName("seoyeon");
        List<String> linkList = new ArrayList<String>();
        linkList.add("#");
        linkList.add("#");
        linkList.add("#");
        person.setUserEmail("yoori0303@naver.com");

        person.setIntroduce("기계가 사람을 대체할지도 모른다는 공포감이 점점 커져가면서 대체될 수 없는 존재가 되고 싶어서 '식품생명공학' 전공에서 IT 개발 직군으로 전향한 비전공자입니다.\n" +
                "폴스타헬스케어에서 개발자 커리어를 시작했고, Java와 Spring-boot를 이용한 서비스를 개발중입니다.\n" +
                "프로그래밍 공부를 지속하기 위해 1일 1커밋 챌린지를 하고 있고 노션에서 TIL(Today I Learned)를 하고 있습니다.\n" +
                "요가와 명상을 진심으로 즐기며, 커피 한 잔을 곁들인 책을 읽는 시간을 사랑합니다.\n" +
                "\n" +
                "내가 하려고 하는 것은 단지 전진하고 발전하는 것이다.\n" +
                "Julian Hatfield");


        ArrayList<ArrayList<String>> skillsList = new ArrayList<ArrayList<String>>();
        ArrayList<String> skill = new ArrayList<String>();
        skill.add("Back-end");
        skill.add("pringBoots Framework / JSP, JPA / Java");
        skill.add("IDE : Eclipse, IntelliJ\n" +
                "연결DB: Oracle, MySQL, H2, MS-SQL\n" +
                "프로젝트 개발을 위해 Spring 기반의 환경 구축하고 maven 및 gradle 프레임워크 사용");
        skillsList.add(skill);

        ArrayList<String> skill1 = new ArrayList<String>();
        skill1.add("Database");
        skill1.add("Oracle, MySQL, MSSQL, PostgreSQL, SQLite");
        skill1.add("IDE : DBeaver, MySQL Workbench, Oracle SQLdeveloper\n" +
                "JSP의 JDBC, Spring의 Mybatis와 연계하여 DB를 이용해보았으며, DB 환경설정 및 구축을 해보며 스키마 생성, 함수, 제약조건 등 sub-query에 대한 기본 지식 갖춤");
        skillsList.add(skill1);

        ArrayList<String> skill2 = new ArrayList<String>();
        skill2.add("Machine Learning");
        skill2.add("Python, Pandas etc.");
        skill2.add("IDE : Pycharm, Jupyter Notebook\n" +
                "Anaconda Jupyter Notebook을 이용하여 크롤링(BeautifulSoup4, requests, lxml, selenium)과 데이터 분석(numpy, pandas, matplotlib, seaborn) 시 사용되는 라이브러리 활용 가능 데이터를 수집하여 EDA 실행 후 시각화도구를 사용. 데이터에 대한 이해도를 바탕으로 분석모델을 설계하고 검증");
        skillsList.add(skill2);

        ArrayList<String> skill3 = new ArrayList<String>();
        skill3.add("Front-end");
        skill3.add("HTML, CSS, VanilaJS");
        skill3.add("IDE : VScode, Atom\n" +
                "'카카오톡' 클론코딩을 통해 HTML, CSS, JavaScript의 활용방법을 익히고 Bootstrap을 사용할 줄 알며 개인프로젝트로 Spring MVC 프로젝트 진행 시 JSP에 JQuery, Ajax, json을 이용했으며 Bootstrap을 활용");
        skillsList.add(skill3);

        ArrayList<ArrayList<String>> expxList = new ArrayList<ArrayList<String>>();
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("빅데이터 플랫폼 구축(하둡)과 빅데이터분석(by Spark&PowerBi)&자바(JAVA)웹개발");
        exp.add("기간 : 2021.02 ~ 2021.07");
        exp.add("더조은아이티아카데미\n" +
                "Spring Framework를 기반으로 요구사항 분석 및 설계부터 개발, 테스트, 배포까지 전반적인 과정을 모두 경험. 또한, 단순히 자바 개발만이 아닌, UI 개발 기술과 데이터베이스 기술, 개발자간 협업 방법, 다양한 산업체에서 요구하는 기술을 두루 배웠고, 현재 대학편입학 입시 전문교육기관인 (주)아이비김영의 편입학 입시데이터를 기반으로 2021학년도 편입학 모집정원 및 모의지원 서비스 데이터를 바탕으로 예측 서비스를 웹으로 구현하는 팀 프로젝트를 진행 중.\n" +
                "- Web 시스템(Back, Front, Database)\n" +
                "- 빅데이터 분산처리 시스템(Hadoop ecosystem)\n" +
                "- 데이터 분석(API, R, Python)");
        expxList.add(exp);

        exp.add("K-Digital 신기술 실무인재양성 해커톤");
        exp.add("기간 : 2021.05 ~ 2021.06");
        exp.add("주요 역할 : 유관 연구자료 조사, 정보 제작\n" +
                "K-Digital 신기술 실무인재양성 해커톤에 참가하여 '수소경제 활성화'를 주제로 수소차 및 수소충전소에 대한 데이터를 분석하여 수소차 유저들에게 필요한 정보(충전소 위치, 수소차 지원 정책 등)을 제공하는 웹서비스를 프로토타입까지 개발. 아쉽게도 예선 탈락");
        expxList.add(exp);

        exp.add("디지털 신기술 핵심 실무인재양성사업 연계 지식재산 교육 이수");
        exp.add("기간 : 2021.05.29 ~ 2021.06.19 매주 토요일");
        exp.add("4회차 교육을 통해 특허와 특허 빅데이터의 기본 개념 및 주요 정보 검색 방법과 R의 이해, 회귀분석 실습, 특허 시각화(Word cloud, Heatmap), 기술분류 이해(텍스트 전처리 방안, 군집화 실습), 기술 예측(연관규칙 분석)을 R Studio를 활용하여 교육받음");
        expxList.add(exp);

        model.addAttribute("person", person);
        model.addAttribute("skillsList", skillsList);
        model.addAttribute("expxList", expxList);
        model.addAttribute("linkList", linkList);

        return "index2";
    }
}
