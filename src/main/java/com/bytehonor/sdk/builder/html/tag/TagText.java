package com.bytehonor.sdk.builder.html.tag;

import com.bytehonor.sdk.builder.html.Html;

public class TagText extends Html {

    private String val;

    public TagText(String val) {
        super();
        this.val = val;
    }

    public TagText() {
        this("");
    }

    @Override
    public String printBegin() {
        return null;
    }

    @Override
    public String printText() {
        return val;
    }

    @Override
    public String printEnd() {
        return null;
    }

    @Override
    public Html attr(String key, String value) {
        throw new RuntimeException("forbidden method");
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
