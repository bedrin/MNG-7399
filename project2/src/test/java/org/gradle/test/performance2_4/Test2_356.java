package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_356 {
    private final Production2_356 production = new Production2_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}