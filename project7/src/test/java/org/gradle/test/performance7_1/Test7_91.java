package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_91 {
    private final Production7_91 production = new Production7_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}