package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_92 {
    private final Production2_92 production = new Production2_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}