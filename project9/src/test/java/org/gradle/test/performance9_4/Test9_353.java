package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_353 {
    private final Production9_353 production = new Production9_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}