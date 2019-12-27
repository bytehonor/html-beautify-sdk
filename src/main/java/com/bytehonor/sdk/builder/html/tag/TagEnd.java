package com.bytehonor.sdk.builder.html.tag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.util.StringUtils;

import com.bytehonor.sdk.builder.html.Html;
import com.bytehonor.sdk.builder.html.attribute.AttributeUtils;

public class TagEnd extends Html {

    private static final Set<String> NEW_LINE_TAGS;

    static {
        NEW_LINE_TAGS = new HashSet<String>();
        NEW_LINE_TAGS.add("html");
        NEW_LINE_TAGS.add("head");
        NEW_LINE_TAGS.add("body");
        NEW_LINE_TAGS.add("div");
        NEW_LINE_TAGS.add("h1");
        NEW_LINE_TAGS.add("h2");
        NEW_LINE_TAGS.add("h3");
        NEW_LINE_TAGS.add("h4");
        NEW_LINE_TAGS.add("p");
        NEW_LINE_TAGS.add("blockquote");
        NEW_LINE_TAGS.add("br");
    }

    private List<Html> tags;

    public TagEnd() {
        this("");
    }

    public TagEnd(String name) {
        super(name);
        this.tags = new ArrayList<Html>();
    }

    @Override
    public Html insert(Html tag) {
        tags.add(tag);
        return this;
    }

    @Override
    public String printBegin() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(name).append(AttributeUtils.print(attributes)).append(">").toString();
//        if (NEW_LINE_TAGS.contains(name)) {
//            sb.append("\r\n");
//        }
        return sb.toString();
    }

    @Override
    public String printText() {
        StringBuilder sb = new StringBuilder();
        for (Html tag : tags) {
            sb.append(tag.print());
        }
        return sb.toString();
    }

    @Override
    public String printEnd() {
        StringBuilder sb = new StringBuilder();
        if (NEW_LINE_TAGS.contains(name)) {
            sb.append("\r\n");
        }
        return sb.append("</").append(name).append(">").toString();
    }

    @Override
    public Html attr(String key, String value) {
        if (StringUtils.isEmpty(key) == false) {
            this.attributes.put(key, value);
        }
        return this;
    }

    @Override
    public Html text(Object val) {
        tags.add(new TagText(String.valueOf(val)));
        return this;
    }

//    public TagEndYes html() {
//        tags.add(new TagEndYes("html"));
//        return this;
//    }
//
//    public TagEndYes head() {
//        tags.add(new TagEndYes("head"));
//        return this;
//    }
//
//    public TagEndYes title() {
//        tags.add(new TagEndYes("title"));
//        return this;
//    }
//
//    public TagEndYes body() {
//        tags.add(new TagEndYes("body"));
//        return this;
//    }
//
//    public TagEndYes div() {
//        tags.add(new TagEndYes("div"));
//        return this;
//    }
//
//    public TagEndYes p() {
//        tags.add(new TagEndYes("p"));
//        return this;
//    }
//
//    public TagEndYes a() {
//        tags.add(new TagEndYes("a"));
//        return this;
//    }
//
//    public TagEndYes h1() {
//        tags.add(new TagEndYes("1"));
//        return this;
//    }
//
//    public TagEndYes h2() {
//        tags.add(new TagEndYes("h2"));
//        return this;
//    }
//
//    public TagEndYes h3() {
//        tags.add(new TagEndYes("h3"));
//        return this;
//    }
//
//    public TagEndYes font() {
//        tags.add(new TagEndYes("font"));
//        return this;
//    }

    public List<Html> getTags() {
        return tags;
    }

    public void setTags(List<Html> tags) {
        this.tags = tags;
    }
}
