package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_331 {
    private final Production2_331 production = new Production2_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}