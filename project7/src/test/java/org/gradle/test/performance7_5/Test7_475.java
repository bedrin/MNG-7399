package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_475 {
    private final Production7_475 production = new Production7_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}