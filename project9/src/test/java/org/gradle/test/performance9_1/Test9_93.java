package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_93 {
    private final Production9_93 production = new Production9_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}