package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_109 {
    private final Production2_109 production = new Production2_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}