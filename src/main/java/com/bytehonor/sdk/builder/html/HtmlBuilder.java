package com.bytehonor.sdk.builder.html;

import java.util.Objects;

import com.bytehonor.sdk.builder.html.tag.TagEnd;
import com.bytehonor.sdk.builder.html.tag.TagNoEnd;

public class HtmlBuilder {

    public static TagEnd tagEnd(String name) {
        Objects.requireNonNull(name);
        return new TagEnd(name);
    }

    public static Html tagNoEnd(String name) {
        Objects.requireNonNull(name);
        return new TagNoEnd(name);
    }

    public static Html html() {
        return tagEnd("html");
    }

    public static Html head() {
        return tagEnd("head");
    }

    public static Html meta() {
        return tagNoEnd("meta");
    }

    public static Html link() {
        return tagNoEnd("link");
    }

    public static Html script() {
        return tagEnd("script");
    }

    public static Html style() {
        return tagEnd("style");
    }

    public static Html title() {
        return tagEnd("title");
    }

    public static Html body() {
        return tagEnd("body");
    }

    public static Html div() {
        return tagEnd("div");
    }

    public static Html p() {
        return tagEnd("p");
    }

    public static Html span() {
        return tagEnd("span");
    }

    public static Html font() {
        return tagEnd("font");
    }

    public static Html a() {
        return tagEnd("a");
    }

    public static Html h1() {
        return tagEnd("h1");
    }

    public static Html h2() {
        return tagEnd("h2");
    }

    public static Html h3() {
        return tagEnd("h3");
    }

    public static Html strong() {
        return tagEnd("strong");
    }

    public static Html i() {
        return tagEnd("i"); // italic斜体
    }

    public static Html ul() {
        return tagEnd("ul");
    }

    public static Html li() {
        return tagEnd("li");
    }

    public static Html blockquote() {
        return tagEnd("blockquote");
    }

    public static Html small() {
        return tagEnd("small");
    }

    public static Html code() {
        return tagEnd("code");
    }

    public static Html figure() {
        return tagEnd("figure");
    }

    ///
    public static Html img() {
        return tagNoEnd("img");
    }

    public static Html input() {
        return tagNoEnd("input");
    }

    public static Html br() {
        return tagNoEnd("br");
    }

    public static Html hr() {
        return tagNoEnd("hr");
    }
}
