package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_303 {
    private final Production2_303 production = new Production2_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}