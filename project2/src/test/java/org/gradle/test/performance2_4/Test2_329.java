package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_329 {
    private final Production2_329 production = new Production2_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}