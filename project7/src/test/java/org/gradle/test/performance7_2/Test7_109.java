package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_109 {
    private final Production7_109 production = new Production7_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}