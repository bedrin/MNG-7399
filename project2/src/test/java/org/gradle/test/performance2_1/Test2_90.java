package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_90 {
    private final Production2_90 production = new Production2_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}