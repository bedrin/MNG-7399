package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_44 {
    private final Production9_44 production = new Production9_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}