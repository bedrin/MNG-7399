package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_36 {
    private final Production7_36 production = new Production7_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}