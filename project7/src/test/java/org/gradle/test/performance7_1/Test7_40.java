package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_40 {
    private final Production7_40 production = new Production7_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}