package com.bytehonor.sdk.builder.html;

import java.util.HashMap;
import java.util.Map;

import com.bytehonor.sdk.builder.html.string.StringHolder;

public abstract class Html {

    protected String name;

    protected Map<String, String> attributes;

    public Html() {
        this("div");
    }

    public Html(String name) {
        this.name = name;
        this.attributes = new HashMap<String, String>();
    }

    public abstract String printBegin();

    public abstract String printText();

    public abstract String printEnd();

    public abstract Html attr(String key, String value);

    public abstract Html text(Object text);

    public abstract Html insert(Html tag);

    public final String print() {
        StringHolder sb = StringHolder.create();
        sb.append(printBegin());
        sb.append(printText());
        sb.append(printEnd());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
    
    @Override
    public String toString() {
        return print();
    }

}
