package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_135 {
    private final Production2_135 production = new Production2_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}