package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_38 {
    private final Production9_38 production = new Production9_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}