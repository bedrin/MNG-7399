package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_43 {
    private final Production4_43 production = new Production4_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}