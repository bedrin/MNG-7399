package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_76 {
    private final Production7_76 production = new Production7_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}