package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_323 {
    private final Production2_323 production = new Production2_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}