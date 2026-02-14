package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Apptest {

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, App.add(2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, App.multiply(2, 3));
    }
}
