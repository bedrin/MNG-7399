package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_73 {
    private final Production5_73 production = new Production5_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}