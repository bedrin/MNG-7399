package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_417 {
    private final Production2_417 production = new Production2_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}