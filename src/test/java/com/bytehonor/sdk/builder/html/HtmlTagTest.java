package com.bytehonor.sdk.builder.html;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlTagTest {

    private static final Logger LOG = LoggerFactory.getLogger(HtmlTagTest.class);

    @Test
    public void test() {
        Html html = HtmlTag.html();
        Html head = HtmlTag.head();
        head.insert(HtmlTag.title().text("this is title"));
        html.insert(head);
        Html body = HtmlTag.body();
        body.insert(HtmlTag.h1().text("h1"));
        body.insert(HtmlTag.div().attr("id", "1")
                .insert(HtmlTag.p().text("this ").insert(HtmlTag.span().text("red").attr("style", "color:red"))));
        body.insert(HtmlTag.br());
        body.insert(HtmlTag.div().attr("id", "2").insert(
                HtmlTag.p().text("this is text2 ").text("this is text21 ").text("this is text22").attr("style", "color:blue").attr("id", "xxx")));
        body.insert(HtmlTag.div().attr("id", "3").insert(HtmlTag.p().insert(HtmlTag.img().attr("src",
                "https://huajietaojin.oss-cn-hangzhou.aliyuncs.com/biaozhunredian/news_cover.jpg"))));
        html.insert(body);

        LOG.info("{}", html.print());
    }
}
