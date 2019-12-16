package com.bytehonor.sdk.builder.html;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlBuilderTest {

    private static final Logger LOG = LoggerFactory.getLogger(HtmlBuilderTest.class);

    @Test
    public void test() {
        Html html = HtmlBuilder.html();
        Html head = HtmlBuilder.head();
        head.insert(HtmlBuilder.title().text("this is title"));
        html.insert(head);
        Html body = HtmlBuilder.body();
        body.insert(HtmlBuilder.h1().text("h1"));
        body.insert(HtmlBuilder.div().attr("id", "1")
                .insert(HtmlBuilder.p().text("this ").insert(HtmlBuilder.span().text("red").style("color:red"))));
        body.insert(HtmlBuilder.br());
        body.insert(HtmlBuilder.div().attr("id", "2").insert(
                HtmlBuilder.p().text("this is text2 ").text("this is text21 ").text("this is text22").attr("style", "color:blue").attr("id", "xxx")));
        body.insert(HtmlBuilder.div().attr("id", "3").insert(HtmlBuilder.p().insert(HtmlBuilder.img().attr("src",
                "https://huajietaojin.oss-cn-hangzhou.aliyuncs.com/biaozhunredian/news_cover.jpg"))));
        html.insert(body);

        LOG.info("{}", html.print());
    }
}
