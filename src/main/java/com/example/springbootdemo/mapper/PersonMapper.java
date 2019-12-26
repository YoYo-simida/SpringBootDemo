package com.example.springbootdemo.mapper;

import com.example.springbootdemo.domain.PersonDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: YoYo
 * @Date: 2019-12-24 07:34
 */
@Mapper
public interface PersonMapper {


    /**
     * 查询 所有
     * @return 所有的人员信息 list
     */
    List<PersonDomain> getPersonAll();
    /**
     * 查询
     * @param no 人员编号
     * @return 人员信息列表
     */
    List<PersonDomain> getPersonByNo(int no);

    /**
     * 插入
     * @param personDomain 人员信息
     * @return 已插入的记录总数
     */
    int insertPerson(PersonDomain personDomain);

    /**
     * 更新
     * @param personDomain 人员信息
     * @return 已更新的记录总数
     */
    int updatePerson(PersonDomain personDomain);


    /**
     * 删除
     * @param no 人员编号
     * @return 已删除的记录总数
     */
    int deletePerson(int no);


    /**
     * 过程
     * @param hashMap Map
     */
    void procedurePerson(Map hashMap);
}
