package com.bytehonor.sdk.builder.html.attribute;

import java.util.Objects;

public class TagAttribute {

    private String key;

    private String value;

    public TagAttribute() {
        this(null, null);
    }

    public TagAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static TagAttribute create(String key, String value) {
        Objects.requireNonNull(key, "key");
        Objects.requireNonNull(value, "value");
        return new TagAttribute(key, value);
    }

    public static TagAttribute id(String value) {
        return create("id", value);
    }

    public static TagAttribute value(String value) {
        return create("value", value);
    }

    public static TagAttribute style(String value) {
        return create("style", value);
    }

    public static TagAttribute name(String value) {
        return create("name", value);
    }

    public static TagAttribute src(String value) {
        return create("src", value);
    }

    public static TagAttribute href(String value) {
        return create("href", value);
    }

    public static TagAttribute color(String value) {
        return create("color", value);
    }

    @Override
    public String toString() {
        return print();
    }

    public String print() {
        return new StringBuilder().append(key).append("=\"").append(value).append("\"").toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
