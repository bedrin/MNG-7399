package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_49 {
    private final Production3_49 production = new Production3_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}