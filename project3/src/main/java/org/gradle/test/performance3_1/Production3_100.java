package org.gradle.test.performance3_1;

public class Production3_100 extends org.gradle.test.performance2_1.Production2_100 {
    private final String property;

    public Production3_100() {
        this.property = "foo";
    }

    public Production3_100(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
