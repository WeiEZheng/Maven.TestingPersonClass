package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name, address,email,birthMonth,phoneNumber;
    private int age,birthDay;

    public Person() {
        this("",Integer.MAX_VALUE);
    }

    public Person(int age) {
        this("",age);
    }

    public Person(String name) {
        this(name,Integer.MAX_VALUE);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void setAddress (String address){
        this.address=address;
    }

    public void setEmail (String email){
        this.email=email;
    }

    public void setBirthMonth (String month){
        this.birthMonth=month;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setBirthDay (int birthDay){
        this.birthDay=birthDay;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getAddress() {return this.address;}

    public String getEmail() {return this.email;}

    public String getBirthMonth () {return this.birthMonth;}

    public int getBirthDay() {return this.birthDay;}
}
