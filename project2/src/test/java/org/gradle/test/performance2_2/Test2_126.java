package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_126 {
    private final Production2_126 production = new Production2_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}