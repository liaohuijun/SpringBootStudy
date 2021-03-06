package com.example.mapper.ds2;

import com.example.pojo.Person;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class PersonSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    public String insertSelective(Person record) {
        BEGIN();
        INSERT_INTO("person");
        
        if (record.getpId() != null) {
            VALUES("p_id", "#{pId,jdbcType=INTEGER}");
        }
        
        if (record.getpName() != null) {
            VALUES("p_name", "#{pName,jdbcType=VARCHAR}");
        }
        
        if (record.getpAge() != null) {
            VALUES("p_age", "#{pAge,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Person record) {
        BEGIN();
        UPDATE("person");
        
        if (record.getpName() != null) {
            SET("p_name = #{pName,jdbcType=VARCHAR}");
        }
        
        if (record.getpAge() != null) {
            SET("p_age = #{pAge,jdbcType=INTEGER}");
        }
        
        WHERE("p_id = #{pId,jdbcType=INTEGER}");
        
        return SQL();
    }
}