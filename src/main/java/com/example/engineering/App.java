package com.example.engineering;

public class App {
    public static void main(String[] args) {

        MathService math = new MathService();
        PhysicsService physics = new PhysicsService();

        System.out.println("Engineering Calculator");
        System.out.println("----------------------");

        System.out.println("Add(10, 5) = " + math.add(10,5));
        System.out.println("Voltage( Current=2A, Resistance=10Ω ) = " + physics.ohmsLawVoltage(2,10) + "V");
        System.out.println("Kinetic Energy( mass=2kg, velocity=5m/s ) = " + physics.kineticEnergy(2,5) + "J");
    }
}
