package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_353 {
    private final Production5_353 production = new Production5_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}