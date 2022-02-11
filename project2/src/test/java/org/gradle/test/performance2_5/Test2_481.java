package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_481 {
    private final Production2_481 production = new Production2_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}