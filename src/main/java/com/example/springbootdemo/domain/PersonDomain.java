package com.example.springbootdemo.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: Person ：人员信息表
 * @Author: YoYo
 * @Date: 2019-12-24 07:24
 */
@Component
public class PersonDomain implements Serializable {
    private int personNo;
    private String name;
    private String sex;
    private Date birthday;

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "PersonDomain{" +
                "personNo=" + personNo +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
