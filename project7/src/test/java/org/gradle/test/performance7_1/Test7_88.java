package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_88 {
    private final Production7_88 production = new Production7_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}