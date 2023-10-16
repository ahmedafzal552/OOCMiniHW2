/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CAR OBJECT
        Car c1 = new Car();
        c1.accelerate(120);
        System.out.println(c1.getMake() + ", " + c1.getType());
        System.out.println("---------------------------------------------------------");
        
        //PLANE OBJECT
        Plane p1 = new Plane();
        p1.getAltitude();
        System.out.println(p1.getMake() + ", " + p1.getType());
        System.out.println("---------------------------------------------------------");
        
        //SHIP OBJECT
        Ship s1 = new Ship();
        s1.hoistSail();
        s1.lowerSail();
        System.out.println("Is Sail Hoisted: " + s1.isSailHoisted());
        
        
    }
    
}
