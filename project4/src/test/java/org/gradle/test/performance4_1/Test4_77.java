package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_77 {
    private final Production4_77 production = new Production4_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}