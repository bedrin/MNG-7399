package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_77 {
    private final Production1_77 production = new Production1_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}