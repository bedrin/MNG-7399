package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_154 {
    private final Production9_154 production = new Production9_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}