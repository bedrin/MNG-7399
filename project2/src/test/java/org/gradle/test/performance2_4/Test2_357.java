package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_357 {
    private final Production2_357 production = new Production2_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}