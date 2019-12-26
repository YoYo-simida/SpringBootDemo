package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.PersonDomain;
import com.example.springbootdemo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: YoYo
 * @Date: 2019-12-24 07:44
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<PersonDomain> getPersonAll() {
        return personMapper.getPersonAll();
    }

    @Override
    public List<PersonDomain> getPersonByNo(int no) {
        return personMapper.getPersonByNo(no);
    }

    @Override
    public int insertPerson(PersonDomain personDomain) {
        return personMapper.insertPerson(personDomain);
    }

    @Override
    public int updatePerson(PersonDomain personDomain) {
        return personMapper.updatePerson(personDomain);
    }

    @Override
    public int deletePerson(int no) {
        return personMapper.deletePerson(no);
    }

    @Override
    public void procedurePerson(Map hashMap) {
        personMapper.procedurePerson(hashMap);
    }
}
