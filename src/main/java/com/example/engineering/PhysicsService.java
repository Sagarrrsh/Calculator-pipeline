package com.example.engineering;

public class PhysicsService {

    // V = I × R
    public double ohmsLawVoltage(double current, double resistance) {
        return current * resistance;
    }

    // KE = 1/2 × m × v²
    public double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }
}
