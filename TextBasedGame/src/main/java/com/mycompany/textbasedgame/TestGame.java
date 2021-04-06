/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textbasedgame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sahil
 */
public class TestGame {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Child dennis = new Child("Dennis", "Menance","The Menance", 10, "Male", 50);
        Adult sandra =  new Adult ("Sandra", "Menance", "Dennis's Mum", 38, "Female", 50, "parent");
        Adult dennisSnr = new Adult("Dennis","Menance", "Dennis's Dad", 42, "Male", 40, "Stationary Worksman");
        Child bea =  new Child ("Beatrice","Menance", "Bea", 3, "Female", 20);
        Adult granny = new Adult("Granny","Menance", "Granny", 80, "Female", 50, "GrandParent");
        Child walter = new Child ("Walter Brown","", "The softy", 12, "Male", 40);
        Adult wilbur = new Adult("Wilbur", "Brown","Walter's Dad", 49, "Male", 40, "Mayor");
        Adult carol = new Adult("Carol","Creecher","The Creecher", 40, "Female", 40, "Teacher");
        Child peter = new Child("Peter", "Shepherd","PiePace", 10, "Male", 30);
        Adult slipper = new Adult("Sergeant Slipper","Slipper", "Slipper", 40, "Male", 35, "Police Officer");
        Adult godfrey = new Adult("Godfrey", "Colonel", "Colonel", 40, "Male", 45, "Miltary Ventran");
        Dog gnasher = new Dog ("Gnasher", 3, "Male", 40);
        Bird joe = new Bird("joe", 5, "Male", 45);
        Dog gnipper = new Dog("Gnipper", 3, "Male", 35);
        Pig rasher = new Pig("Rasher", 4, "Male", 25);
        Robot gnashinator = new Robot("Gnashinator", "Male", 566789, 40);
        
        
        
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("The front room");
        locations.add("The treehouse");
        locations.add("The park");
        locations.add("MI 13 Secret Service headqueaters");
        locations.add("Bash Street School");
        
        ArrayList<String> items = new ArrayList<String>();
        items.add("Catapults");
        items.add("Pies");
        items.add("Skateboards");
        items.add("Sausages");
        items.add("Hats");
        items.add("Masks");
        items.add("Fake beard");
        
        System.out.println("Welcome to Dennis The meneance Text Editior Game!");
        System.out.println("Do you want to start the game?"  + "\n" +  "Enter yes or no.");
        String start = in.nextLine();
        if(start.equals ("Yes") || start.equals ("yes")){
            System.out.println("You have entered the Menance World!");
        } else{
            System.out.println("Game over");
        }
        System.out.println("Where you want to enter first with " + dennis.getForename()+ "?" + "\n" + "Enter any of the following locations: ");
        for(String i: locations){
            System.out.println(i);
        }
        String enter = in.nextLine();
        
        
       
        
        
        
        
       
    }
    
    
}
