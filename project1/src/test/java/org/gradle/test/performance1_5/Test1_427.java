package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_427 {
    private final Production1_427 production = new Production1_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}