package org.gradle.test.performance2_1;

public class Production2_100 extends org.gradle.test.performance1_1.Production1_100 {
    private final String property;

    public Production2_100() {
        this.property = "foo";
    }

    public Production2_100(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
