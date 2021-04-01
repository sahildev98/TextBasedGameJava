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
    public Adult(String name, int age, String gender, int health, String job, String grounded) {
        super(name, age, gender, health);
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
        System.out.println("" + getJob() + " attacks ");
    }
}
