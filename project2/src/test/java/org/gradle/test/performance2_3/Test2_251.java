package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_251 {
    private final Production2_251 production = new Production2_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}