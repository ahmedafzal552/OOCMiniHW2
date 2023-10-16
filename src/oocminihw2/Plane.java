/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author ahmed
 */
public class Plane extends Vehicle implements Flyable{

    @Override
    public void changeAltitude(float change) {
        System.out.println("This your captain we change the altitude " + change + " ft.");
    }

    @Override
    public float getAltitude() {
        return 40000;
    }  

    @Override
    public void accelerate(float speed) {
        System.out.println("I am Speed.." + speed);
    }

    @Override
    public void brake() {
        System.out.println("Brakes Apply on Plane");
    }

    @Override
    public void turn(float angle) {
        System.out.println("Plane turn " + angle + " angle.");
    }

    @Override
    public float getDirection() {
        return 3;
    }

    @Override
    public float getSpeed() {
        return 1200;
    }

    @Override
    public String getMake() {
        return "Qatar Airways Airbus A380";
    }

    @Override
    public String getType() {
        return "Boeing 747";
    }
    
}
