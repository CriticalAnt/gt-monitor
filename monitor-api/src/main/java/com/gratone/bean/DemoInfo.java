package com.gratone.bean;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by wts on 2018/10/24.
 */
public class DemoInfo {

    @Id
    private String id;
    @Column
    private String name;
    @Column
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
