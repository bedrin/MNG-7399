package org.gradle.test.performance9_1;

public class Production9_2 extends org.gradle.test.performance6_1.Production6_2 {
    private final String property;

    public Production9_2() {
        this.property = "foo";
    }

    public Production9_2(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
