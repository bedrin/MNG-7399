package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_390 {
    private final Production7_390 production = new Production7_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}