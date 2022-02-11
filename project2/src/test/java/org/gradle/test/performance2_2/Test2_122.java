package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_122 {
    private final Production2_122 production = new Production2_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}