package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_66 {
    private final Production2_66 production = new Production2_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}