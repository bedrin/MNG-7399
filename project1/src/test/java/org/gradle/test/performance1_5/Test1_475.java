package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_475 {
    private final Production1_475 production = new Production1_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}