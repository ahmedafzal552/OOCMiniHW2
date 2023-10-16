/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author ahmed
 */
public class Ship extends Vehicle implements Sailable{

    @Override
    public void hoistSail() {
        System.out.println("Boat is Hoisted and speed is increasing.");
    }

    @Override
    public void lowerSail() {
        System.out.println("Boat is lowering and speed is decreasing.");
    }  

    @Override
    public boolean isSailHoisted() {
        return true;
    }

    @Override
    public void landHo() {
        System.out.println("Land has been spotted.");
    } 
    
}
