package org.gradle.test.performance7_1;

public class Production7_1 extends org.gradle.test.performance2_1.Production2_1 {
    private final String property;

    public Production7_1() {
        this.property = "foo";
    }

    public Production7_1(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
