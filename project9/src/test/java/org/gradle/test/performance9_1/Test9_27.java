package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_27 {
    private final Production9_27 production = new Production9_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}