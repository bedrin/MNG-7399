package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_28 {
    private final Production7_28 production = new Production7_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}