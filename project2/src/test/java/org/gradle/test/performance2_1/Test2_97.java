package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_97 {
    private final Production2_97 production = new Production2_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}