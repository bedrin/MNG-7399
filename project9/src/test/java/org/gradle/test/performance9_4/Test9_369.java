package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_369 {
    private final Production9_369 production = new Production9_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}