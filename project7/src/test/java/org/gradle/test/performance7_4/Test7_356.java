package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_356 {
    private final Production7_356 production = new Production7_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}