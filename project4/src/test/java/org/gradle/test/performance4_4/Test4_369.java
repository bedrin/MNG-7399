package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_369 {
    private final Production4_369 production = new Production4_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}