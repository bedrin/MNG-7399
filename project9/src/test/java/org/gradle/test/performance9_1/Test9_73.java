package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_73 {
    private final Production9_73 production = new Production9_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}