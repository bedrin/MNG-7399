package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_34 {
    private final Production2_34 production = new Production2_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}