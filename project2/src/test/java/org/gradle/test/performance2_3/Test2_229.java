package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_229 {
    private final Production2_229 production = new Production2_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}