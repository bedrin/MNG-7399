package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_77 {
    private final Production7_77 production = new Production7_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}