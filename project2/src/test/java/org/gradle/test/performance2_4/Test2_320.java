package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_320 {
    private final Production2_320 production = new Production2_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}