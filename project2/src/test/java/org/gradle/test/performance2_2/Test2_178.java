package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_178 {
    private final Production2_178 production = new Production2_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}