package com.example.engineering;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathServiceTest {

    @Test
    void testAdd() {
        MathService math = new MathService();
        assertEquals(8, math.add(5, 3));
    }
}
