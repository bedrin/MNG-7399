package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_195 {
    private final Production9_195 production = new Production9_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}