package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_114 {
    private final Production2_114 production = new Production2_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}