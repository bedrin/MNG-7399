package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_44 {
    private final Production1_44 production = new Production1_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}