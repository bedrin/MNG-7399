package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_231 {
    private final Production7_231 production = new Production7_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}