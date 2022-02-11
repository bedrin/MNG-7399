package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_353 {
    private final Production4_353 production = new Production4_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}