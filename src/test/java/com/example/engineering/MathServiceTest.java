package com.example.engineering;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathServiceTest {

    @Test
    void testAdd() {
        MathService math = new MathService();
        assertEquals(8, math.add(5, 3));
    }

    @Test
    void testSubtract() {
        MathService math = new MathService();
        assertEquals(6, math.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        MathService math = new MathService();
        assertEquals(42, math.multiply(6, 7));
    }

    @Test
    void testDivide() {
        MathService math = new MathService();
        assertEquals(5.0, math.divide(20, 4), 0.001);
    }
}
