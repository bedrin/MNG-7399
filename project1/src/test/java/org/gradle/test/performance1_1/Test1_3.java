package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_3 {
    private final Production1_3 production = new Production1_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}