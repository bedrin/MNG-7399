package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_442 {
    private final Production7_442 production = new Production7_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}