package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_442 {
    private final Production2_442 production = new Production2_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}