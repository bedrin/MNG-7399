package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_98 {
    private final Production1_98 production = new Production1_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}