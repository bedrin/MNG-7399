package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_293 {
    private final Production5_293 production = new Production5_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}