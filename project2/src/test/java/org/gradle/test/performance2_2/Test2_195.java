package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_195 {
    private final Production2_195 production = new Production2_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}