package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_178 {
    private final Production9_178 production = new Production9_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}