package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_190 {
    private final Production9_190 production = new Production9_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}