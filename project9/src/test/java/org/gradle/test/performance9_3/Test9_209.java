package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_209 {
    private final Production9_209 production = new Production9_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}