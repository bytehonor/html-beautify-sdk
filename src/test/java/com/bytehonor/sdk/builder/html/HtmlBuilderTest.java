package com.bytehonor.sdk.builder.html;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bytehonor.sdk.builder.html.style.MdStyle;

public class HtmlBuilderTest {

    private static final Logger LOG = LoggerFactory.getLogger(HtmlBuilderTest.class);

//    @Test
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
        body.insert(HtmlBuilder.div().attr("id", "2").insert(HtmlBuilder.p().text("this is text2 ")
                .text("this is text21 ").text("this is text22").attr("style", "color:blue").attr("id", "xxx")));
        body.insert(HtmlBuilder.div().attr("id", "3").insert(HtmlBuilder.p().insert(HtmlBuilder.img().attr("src",
                "https://huajietaojin.oss-cn-hangzhou.aliyuncs.com/biaozhunredian/news_cover.jpg"))));
        html.insert(body);

        LOG.info("{}", html.print());
    }

    @Test
    public void testArticle() {
        Html div = HtmlBuilder.div().style(MdStyle.FONT_FAMILY + MdStyle.TEXT_ALIGN_LEFT + MdStyle.FONT_COLOR);

        String jpg = "https://bytehonor.oss-cn-hangzhou.aliyuncs.com/up/topic/image/944921261094a650bede2cec814282ed.jpg";
        for (int i = 1; i < 25; i++) {
            div.insert(HtmlBuilder.h2().text("权健公司及束昱辉等涉嫌组织领导传销活动案一审开庭择期宣判").style(MdStyle.H2_1));
            Html rank = HtmlBuilder.strong().text(i).style(MdStyle.STRONG);
            Html hot = HtmlBuilder.strong().text("10.3亿").style(MdStyle.STRONG);
            Html total = HtmlBuilder.strong().text("67").style(MdStyle.STRONG);
            div.insert(HtmlBuilder.p().text("全网排名第").insert(rank).text("，热度").insert(hot).text("，有").insert(total)
                    .text("条主流媒体报道").style(MdStyle.P));
            div.insert(HtmlBuilder.p().style(MdStyle.P_BR_AFTER_P));
            Html figure = HtmlBuilder.figure().style(MdStyle.FIGURE)
                    .insert(HtmlBuilder.img().attr("src", jpg).attr("desc", "插图").style(MdStyle.IMG));
            div.insert(figure);
            Html p = HtmlBuilder.p().text(
                    "【教育部：要集中治理高校教师性骚扰学生等行为】近日，高校接连曝出教师性侵学生等师德违规行为，掀起舆论风波。教育部等七部门已印发《关于加强和改进新时代师德师风建设的意见》，要求将师德师风建设要求贯穿教师管理全过程，思想政治和师德要求应纳入教师聘用合同，师德考核不合格者年度考核应评定为不合格，并取消在教师职称评聘、推优评先、表彰奖励、科研和人才项目申请等方面的资格。意见还明确，各地应针对高校教师性骚扰学生、学术不端以及中小学教师违规有偿补课等开展集中治理，严重违法违规者将清除出教师队伍。 at"
                            + i)
                    .style(MdStyle.P);
            div.insert(p);
            div.insert(HtmlBuilder.h3().text("报道媒体").style(MdStyle.H3));

            Html pTitles = HtmlBuilder.p().style(
                    "color:grey;line-height:1.75;font-size:14px;margin-left:0;padding-left:1em;list-style:circle");
            for (int k = 0; k < 3; k++) {
                Html spanTitle = HtmlBuilder.span().style("text-indent:-1em;display:block;margin:0.2em 8px");
                spanTitle.insert(HtmlBuilder.strong().text("人民网网站").style(MdStyle.STRONG));
                spanTitle.text("：权健公司及束昱辉等涉嫌组织领导传销活动案一审开庭 16:48");
                pTitles.insert(spanTitle);
            }
            div.insert(pTitles);

            Html blockquote = HtmlBuilder.blockquote().style(MdStyle.BLOCKQUOTE);
            Html blockquoteNames = HtmlBuilder.p().style(MdStyle.BLOCKQUOTE_P_SMALL);
            for (int j = 0; j < 15; j++) {
                blockquoteNames.text("人民日报" + j + "、");
            }
            blockquoteNames.text("等75家媒体均有报道");
            blockquote.insert(blockquoteNames);
            div.insert(blockquote);
        }
        Html html = HtmlBuilder.html();
        Html head = HtmlBuilder.head();
        head.insert(HtmlBuilder.title().text("this is title"));
        html.insert(head);
        Html body = HtmlBuilder.body();
        body.insert(div);
        // 免责声明
        Html divDisclaimer = HtmlBuilder.div();
        divDisclaimer.insert(HtmlBuilder.p().insert(HtmlBuilder.br()).style(MdStyle.P_BR_AFTER_P));
        divDisclaimer.insert(HtmlBuilder.p().text("以上内容回复公众号可搜索新闻原文。若有侵犯您的权益，请您私信我们，我们将第一时间处理。版权保护，人人有责。")
                .style(MdStyle.P + "color:orange;"));
        divDisclaimer.insert(HtmlBuilder.p().insert(HtmlBuilder.br()).style(MdStyle.P_BR_AFTER_P));
        body.insert(divDisclaimer);
        html.insert(body);
        String print = html.print();
        LOG.info("{}", print);
        LOG.info("length:{}", print.length());
    }
}
