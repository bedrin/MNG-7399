package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_369 {
    private final Production5_369 production = new Production5_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}