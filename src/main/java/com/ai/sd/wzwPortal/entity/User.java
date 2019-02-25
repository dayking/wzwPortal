package com.ai.sd.wzwPortal.entity;

/**
 * @Author: 潘旭东
 * @Date: 2019/2/23 11:16
 * @remark bug no no no
 */
public class User {
    
    private Long id;
    private String name;
    private Integer age;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
}
