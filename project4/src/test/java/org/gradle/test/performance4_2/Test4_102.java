package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_102 {
    private final Production4_102 production = new Production4_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}