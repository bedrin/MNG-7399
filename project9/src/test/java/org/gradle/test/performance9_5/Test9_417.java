package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_417 {
    private final Production9_417 production = new Production9_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}