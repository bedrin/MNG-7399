package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_214 {
    private final Production7_214 production = new Production7_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}