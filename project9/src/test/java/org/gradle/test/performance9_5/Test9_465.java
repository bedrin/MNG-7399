package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_465 {
    private final Production9_465 production = new Production9_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}