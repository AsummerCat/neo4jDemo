package com.linjingc.neo4jdemo;

import com.linjingc.neo4jdemo.dao.PersonRepository;
import com.linjingc.neo4jdemo.entity.Children;
import com.linjingc.neo4jdemo.entity.Parent;
import com.linjingc.neo4jdemo.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class Neo4jDemoApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        Person person = new Person();
        person.setName("小东");
        //保存节点数据
        personRepository.save(person);

        //查询节点id
        Optional<Person> byId = personRepository.findById(41L);
        Person resPerson = byId.get();
        System.out.println(resPerson);

        //删除节点
        personRepository.deleteById(21L);


        //构建关系
        Set<Parent> parentList = new HashSet<>();
        Set<Children> childList = new HashSet<>();

        Person info = new Person();
        info.setName("本人");
        Children children = new Children();
        children.setName("儿子");
        Parent parent = new Parent();
        parent.setName("爸爸");
        childList.add(children);
        parentList.add(parent);
        info.setChildList(childList);
        info.setParentList(parentList);
        personRepository.save(info);

    }

}
