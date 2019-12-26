package com.example.springbootdemo.controller;


import com.example.springbootdemo.domain.PersonDomain;
import com.example.springbootdemo.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: YoYo
 * @Date: 2019-12-24 07:07
 */
@Controller
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @RequestMapping("/demo")
    public String hello() {
        logger.info("调用成功：/demo");
        return "login";
    }

    @RequestMapping("/selectAll")
    public String selectAll() {
        logger.info("调用成功: /selectAll");
        List<PersonDomain> personAll = personService.getPersonAll();
        for (PersonDomain item : personAll
        ) {
            System.out.println(item);
        }
        return "login";
    }

    @RequestMapping("/select")
    public String select() {
        logger.info("调用成功: /select");
        List<PersonDomain> personByNo = personService.getPersonByNo(1);
        for (PersonDomain item : personByNo
        ) {
            System.out.println(item);
        }
        return "login";
    }

    @RequestMapping("/insert")
    public String insert() {
        logger.info("调用成功: /insert");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("1994-12-08");
        } catch (ParseException e) {
            logger.info("/insert: 时间格式设置异常");
            e.printStackTrace();
        }

        PersonDomain personDomain = new PersonDomain();
        personDomain.setPersonNo(2);
        personDomain.setName("小悠悠");
        personDomain.setSex("女");
        personDomain.setBirthday(date);

        int i = personService.insertPerson(personDomain);
        System.out.println("插入 " + i + " 条记录");
        return "login";
    }

    @RequestMapping("/update")
    private String update() {
        logger.info("调用成功: /update");
        PersonDomain personDomain = new PersonDomain();
        personDomain.setPersonNo(1);
        personDomain.setName("小倩倩");
        personDomain.setSex("男");
        personDomain.setBirthday(new Date());

        int i = personService.updatePerson(personDomain);
        System.out.println("更新 " + i + " 条记录");
        return "login";
    }

    @RequestMapping("/delete")
    private String delete(){
        logger.info("调用成功: /delete");
        PersonDomain personDomain = new PersonDomain();
        personDomain.setPersonNo(2);

        int i = personService.deletePerson(personDomain.getPersonNo());
        System.out.println("删除 " + i + " 条记录");
        return "login";
    }

    @RequestMapping("/procedure")
    private String procedure(){
        logger.info("调用成功: /procedure");
        Map map = new HashMap();
        map.put("v_person_no", 1);

        personService.procedurePerson(map);
        System.out.println(map.get("v_flag"));
        return "login";
    }
}
