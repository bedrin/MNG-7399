package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_393 {
    private final Production5_393 production = new Production5_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}