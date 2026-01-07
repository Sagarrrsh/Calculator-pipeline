package com.example.engineering;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathServiceTest {

    @Test
    public void testAdd() {
        MathService math = new MathService();
        assertEquals(7, math.add(3,4));
    }

    @Test
    public void testDivide() {
        MathService math = new MathService();
        assertEquals(5.0, math.divide(10,2), 0.001);
    }
}
