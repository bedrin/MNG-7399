package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_91 {
    private final Production1_91 production = new Production1_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}