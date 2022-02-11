package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_76 {
    private final Production4_76 production = new Production4_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}