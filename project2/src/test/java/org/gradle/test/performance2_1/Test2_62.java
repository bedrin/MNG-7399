package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_62 {
    private final Production2_62 production = new Production2_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}