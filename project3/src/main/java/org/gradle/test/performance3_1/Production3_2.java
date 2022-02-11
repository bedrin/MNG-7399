package org.gradle.test.performance3_1;

public class Production3_2 extends org.gradle.test.performance2_1.Production2_2 {
    private final String property;

    public Production3_2() {
        this.property = "foo";
    }

    public Production3_2(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
