package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_96 {
    private final Production5_96 production = new Production5_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}