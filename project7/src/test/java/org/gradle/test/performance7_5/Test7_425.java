package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_425 {
    private final Production7_425 production = new Production7_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}