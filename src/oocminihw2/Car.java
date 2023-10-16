/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author ahmed
 */
public class Car extends Vehicle implements Drivable{

    @Override
    public void accelerate(float speed) {
        System.out.println("I am Speed.." + speed);
    }

    @Override
    public void brake() {
        System.out.println("Brakes Apply on Car");
    }

    @Override
    public void turn(float angle) {
        System.out.println("Car turn " + angle + " angle.");
    }

    @Override
    public float getDirection() {
        return 4;
    }

    @Override
    public float getSpeed() {
        return 120;
    }

    @Override
    public String getMake() {
        return "Toyota Corola 2023";
    }

    @Override
    public String getType() {
        return "Sedan type Car";
    }
    
    
}
