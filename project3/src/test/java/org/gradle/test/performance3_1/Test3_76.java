package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_76 {
    private final Production3_76 production = new Production3_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}