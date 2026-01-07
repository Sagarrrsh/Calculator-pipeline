package com.example.engineering;

import org.junit.Test;
import static org.junit.Assert.*;

public class PhysicsServiceTest {

    @Test
    public void testOhmsLaw() {
        PhysicsService physics = new PhysicsService();
        assertEquals(20.0, physics.ohmsLawVoltage(2,10), 0.001);
    }

    @Test
    public void testKineticEnergy() {
        PhysicsService physics = new PhysicsService();
        assertEquals(25.0, physics.kineticEnergy(2,5), 0.001);
    }
}
