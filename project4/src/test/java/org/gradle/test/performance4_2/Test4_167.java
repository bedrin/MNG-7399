package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_167 {
    private final Production4_167 production = new Production4_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}