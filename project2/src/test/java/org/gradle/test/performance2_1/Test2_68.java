package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_68 {
    private final Production2_68 production = new Production2_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}