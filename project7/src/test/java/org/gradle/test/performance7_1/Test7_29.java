package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_29 {
    private final Production7_29 production = new Production7_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}