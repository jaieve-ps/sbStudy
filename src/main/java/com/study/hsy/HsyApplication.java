package com.study.hsy;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class HsyApplication {
	public static void main(String[] args) {
		SpringApplication.run(HsyApplication.class, args);
	}
	/*
	* SqlSessionFactory 설정
	* */
//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource(dataSource);
//		return sessionFactory.getObject();
//	}
}
