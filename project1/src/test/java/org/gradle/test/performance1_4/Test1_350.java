package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_350 {
    private final Production1_350 production = new Production1_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}