package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_27 {
    private final Production2_27 production = new Production2_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}