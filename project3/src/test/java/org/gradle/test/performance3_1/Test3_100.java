package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_100 {
    private final Production3_100 production = new Production3_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}