package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_215 {
    private final Production2_215 production = new Production2_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}