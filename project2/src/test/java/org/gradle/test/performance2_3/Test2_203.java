package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_203 {
    private final Production2_203 production = new Production2_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}