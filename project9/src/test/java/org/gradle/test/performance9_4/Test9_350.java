package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_350 {
    private final Production9_350 production = new Production9_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}