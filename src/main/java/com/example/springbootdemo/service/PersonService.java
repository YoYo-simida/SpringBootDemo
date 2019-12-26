package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.PersonDomain;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: YoYo
 * @Date: 2019-12-24 07:43
 */
public interface PersonService {

    List<PersonDomain> getPersonAll();

    List<PersonDomain> getPersonByNo(int no);

    int insertPerson(PersonDomain personDomain);

    int updatePerson(PersonDomain personDomain);

    int deletePerson(int no);

    void procedurePerson(Map hashMap);
}
