package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_293 {
    private final Production7_293 production = new Production7_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}