package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_33 {
    private final Production2_33 production = new Production2_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}