package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_69 {
    private final Production2_69 production = new Production2_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}