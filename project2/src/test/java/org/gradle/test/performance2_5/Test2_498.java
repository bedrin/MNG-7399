package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_498 {
    private final Production2_498 production = new Production2_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}