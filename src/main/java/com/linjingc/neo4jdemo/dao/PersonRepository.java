package com.linjingc.neo4jdemo.dao;

import com.linjingc.neo4jdemo.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * 创建对应接口类 继承Neo4jRepository
 */
@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

}
