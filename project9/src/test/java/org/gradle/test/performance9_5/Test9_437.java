package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_437 {
    private final Production9_437 production = new Production9_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}