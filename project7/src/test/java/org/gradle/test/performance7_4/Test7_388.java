package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_388 {
    private final Production7_388 production = new Production7_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}