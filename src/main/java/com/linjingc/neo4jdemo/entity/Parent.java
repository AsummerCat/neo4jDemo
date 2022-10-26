package com.linjingc.neo4jdemo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.io.Serializable;
import java.util.Set;

/**
 * neo4j节点
 */
@Data
@Node("Parent")
public class Parent implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;

}
