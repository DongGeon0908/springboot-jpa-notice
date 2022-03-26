package com.example.notice.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;


@Configuration
public class QuerydslConfig {

  @Bean
  JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
    return new JPAQueryFactory(entityManager);
  }
}
