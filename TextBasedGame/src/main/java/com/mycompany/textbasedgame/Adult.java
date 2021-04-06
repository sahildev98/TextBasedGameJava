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
public class Adult extends Person{
    private String job;
    public Adult(String forename, String surname,String nickname, int age, String gender, int health, String job) {
        super(forename, surname, nickname, age, gender, health);
        this.job = job;
    }
    
    public void issueBan(){
        String grounded = " you're banned";
        System.out.println(grounded);
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String newJob){
       job = newJob;
    }
          
    
    public void jobAttack(){
        System.out.println(getJob() + " attacks ");
    }

    @Override
    public void move() {
        System.out.println(" is moving ");
    }

    @Override
    public void attack() {
        System.out.println(" is attacking ");
    }
}
