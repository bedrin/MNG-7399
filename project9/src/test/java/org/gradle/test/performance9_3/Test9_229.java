package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_229 {
    private final Production9_229 production = new Production9_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}