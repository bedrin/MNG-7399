package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_353 {
    private final Production3_353 production = new Production3_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}