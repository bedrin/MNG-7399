package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_49 {
    private final Production1_49 production = new Production1_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}