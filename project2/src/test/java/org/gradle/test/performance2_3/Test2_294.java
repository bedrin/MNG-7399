package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_294 {
    private final Production2_294 production = new Production2_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}