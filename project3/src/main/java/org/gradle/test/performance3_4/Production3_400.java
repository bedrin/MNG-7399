package org.gradle.test.performance3_4;

public class Production3_400 extends org.gradle.test.performance2_4.Production2_400 {
    private final String property;

    public Production3_400() {
        this.property = "foo";
    }

    public Production3_400(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
