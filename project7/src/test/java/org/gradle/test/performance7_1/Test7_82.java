package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_82 {
    private final Production7_82 production = new Production7_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}