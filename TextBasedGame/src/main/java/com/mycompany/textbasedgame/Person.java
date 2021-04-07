/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textbasedgame;

/**
 *
 * @author Sahil
 */
public abstract class Person {
    private String forename;
    private String surname;
    private String nickname;
    private int age;
    private String gender;
    private int health; 

    public Person(String forename, String surname, String nickname, int age, String gender, int health) {
        this.forename = forename;
        this.surname  = surname;
        this.nickname =  nickname;
        this.age = age;
        this.gender = gender;
        this.health = health;
    }
    
     public String getForename(){
        return forename;
    }
    
    public void setForename(String newForename){
        forename = newForename;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    
    public String getNickname(){
        return nickname;
    }
    
    public void setNickname(String newNickname){
        nickname = newNickname;
    }
    
    public int getAge(){
      return age;
    }
    
    public void setAge(int newAge){
      age =  newAge;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setGender(String newGender){
        gender = newGender;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHhealth(int newAge){
       age = newAge;
    }
    
    public void reduceHealth(){
        health-=10;
    }
    
    public void increaseHealth(){
        health+=10;
    }
    
    public abstract String move();
    
    public abstract String noMovement();
    
    public abstract String attack();
}
