package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_475 {
    private final Production8_475 production = new Production8_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}