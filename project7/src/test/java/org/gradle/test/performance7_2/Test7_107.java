package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_107 {
    private final Production7_107 production = new Production7_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}