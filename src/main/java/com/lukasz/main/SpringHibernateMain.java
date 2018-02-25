package com.lukasz.main;

import com.lukasz.dao.PersonDAO;
import com.lukasz.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Slf4j
public class SpringHibernateMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        Person person = new Person();
        person.setName("Lukasz");
        person.setCountry("Poland");

        personDAO.save(person);

        log.info("Person:" + person);
        List<Person> list = personDAO.list();

        for (Person p : list) {
            log.info("Person List: " + p);
        }

        context.close();
    }
}
