package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_72 {
    private final Production7_72 production = new Production7_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}