package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_77 {
    private final Production9_77 production = new Production9_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}