package com.happypaws.happypaws.login.POJO;

public class User {

    private String name;
    private String lastName;
    private Integer age;
    private String profile;

    public User(String name, String lastName, Integer age, String profile) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
