package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_234 {
    private final Production5_234 production = new Production5_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}