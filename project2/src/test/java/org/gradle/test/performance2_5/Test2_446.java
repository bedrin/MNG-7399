package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_446 {
    private final Production2_446 production = new Production2_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}