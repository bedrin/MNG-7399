package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_266 {
    private final Production2_266 production = new Production2_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}