package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_102 {
    private final Production3_102 production = new Production3_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}