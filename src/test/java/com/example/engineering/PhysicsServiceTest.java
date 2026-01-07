package com.example.engineering;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhysicsServiceTest {

    @Test
    void testOhmsLawVoltage() {
        PhysicsService physics = new PhysicsService();
        assertEquals(20.0, physics.ohmsLawVoltage(2, 10), 0.001);
    }

    @Test
    void testKineticEnergy() {
        PhysicsService physics = new PhysicsService();
        assertEquals(25.0, physics.kineticEnergy(2, 5), 0.001);
    }
}
