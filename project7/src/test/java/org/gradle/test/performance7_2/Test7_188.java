package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_188 {
    private final Production7_188 production = new Production7_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}