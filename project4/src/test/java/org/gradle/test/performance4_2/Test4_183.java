package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_183 {
    private final Production4_183 production = new Production4_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}