package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_212 {
    private final Production2_212 production = new Production2_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}