package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_100 {
    private final Production7_100 production = new Production7_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}