package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_68 {
    private final Production9_68 production = new Production9_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}