package com.bytehonor.sdk.builder.html.tag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bytehonor.sdk.builder.html.Html;
import com.bytehonor.sdk.builder.html.attribute.AttributeUtils;

/**
 * @author lijianqiang
 *
 */
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
//        if (NEW_LINE_TAGS.contains(name)) {
//            sb.append("\r\n");
//        }
        return sb.append("</").append(name).append(">").toString();
    }

    @Override
    public Html attr(String key, String value) {
        if (key != null && !key.isEmpty()) {
            this.attributes.put(key, value);
        }
        return this;
    }

    @Override
    public Html text(Object val) {
        tags.add(new TagText(String.valueOf(val)));
        return this;
    }

    public List<Html> getTags() {
        return tags;
    }

    public void setTags(List<Html> tags) {
        this.tags = tags;
    }
}
