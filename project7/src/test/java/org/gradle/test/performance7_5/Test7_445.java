package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_445 {
    private final Production7_445 production = new Production7_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}