package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_93 {
    private final Production2_93 production = new Production2_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}