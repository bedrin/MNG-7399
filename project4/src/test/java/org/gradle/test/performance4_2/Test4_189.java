package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_189 {
    private final Production4_189 production = new Production4_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}