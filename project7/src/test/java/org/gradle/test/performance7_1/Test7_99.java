package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_99 {
    private final Production7_99 production = new Production7_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}