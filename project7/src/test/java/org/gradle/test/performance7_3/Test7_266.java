package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_266 {
    private final Production7_266 production = new Production7_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}