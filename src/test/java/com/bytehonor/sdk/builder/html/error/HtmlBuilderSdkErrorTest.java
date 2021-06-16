package com.bytehonor.sdk.builder.html.error;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HtmlBuilderSdkErrorTest {

    @Test
    public void testGetCode() {
        HtmlBuilderSdkError se = new HtmlBuilderSdkError("test");

        assertTrue("testGetCode should return 'true'", "test".equals(se.getMessage()));
    }

}
