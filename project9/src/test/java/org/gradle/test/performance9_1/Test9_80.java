package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_80 {
    private final Production9_80 production = new Production9_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}