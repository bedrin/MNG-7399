package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_369 {
    private final Production2_369 production = new Production2_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}