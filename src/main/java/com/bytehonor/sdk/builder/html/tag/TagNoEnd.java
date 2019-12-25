package com.bytehonor.sdk.builder.html.tag;

import org.springframework.util.StringUtils;

import com.bytehonor.sdk.builder.html.Html;
import com.bytehonor.sdk.builder.html.attribute.AttributeUtils;
import com.bytehonor.sdk.builder.html.string.StringSdkUtils;

public class TagNoEnd extends Html {

    public TagNoEnd() {
        super();
    }

    public TagNoEnd(String name) {
        super(name);
    }

    @Override
    public String printBegin() {
        String attr = AttributeUtils.print(attributes);
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(name);
        if (StringSdkUtils.isEmpty(attr) == false) {
            sb.append(attr);
        }
        return sb.toString();
    }

    @Override
    public String printText() {
        return "";
    }

    @Override
    public String printEnd() {
        return " />";
    }

    @Override
    public Html attr(String key, String value) {
        if (StringUtils.isEmpty(key) == false) {
            this.attributes.put(key, value);
        }
        return this;
    }

    @Override
    public Html text(Object text) {
        throw new RuntimeException("forbidden method");
    }

    @Override
    public Html insert(Html tag) {
        throw new RuntimeException("forbidden method");
    }

}
