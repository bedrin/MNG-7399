package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_89 {
    private final Production7_89 production = new Production7_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}