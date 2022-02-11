package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_195 {
    private final Production4_195 production = new Production4_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}