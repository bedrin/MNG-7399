package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_31 {
    private final Production2_31 production = new Production2_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}