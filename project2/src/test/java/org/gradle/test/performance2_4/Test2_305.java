package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_305 {
    private final Production2_305 production = new Production2_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}