package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_93 {
    private final Production7_93 production = new Production7_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}