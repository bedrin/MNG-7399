package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_444 {
    private final Production9_444 production = new Production9_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}