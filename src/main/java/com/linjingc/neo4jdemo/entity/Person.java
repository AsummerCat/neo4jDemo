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
@Node("person")
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;

    /**
     * @Relationship这个注解表示关系，type是关系名称，direction是方向，例子中的是person——>child
     * 孩子节点
     */
    @Relationship(type = "children", direction = Relationship.Direction.OUTGOING)
    private Set<Children> childList;

    /**
     * 父节点 person<-parent
     */
    @Relationship(type = "parent", direction = Relationship.Direction.INCOMING)
    private Set<Parent> parentList;
}
