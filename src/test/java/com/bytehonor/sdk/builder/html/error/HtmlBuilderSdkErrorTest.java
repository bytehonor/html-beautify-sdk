package com.bytehonor.sdk.builder.html.error;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bytehonor.sdk.builder.html.error.HtmlBuilderSdkError;

public class HtmlBuilderSdkErrorTest {

    @Test
    public void testGetCode() {
        HtmlBuilderSdkError se = new HtmlBuilderSdkError("test");

        assertTrue("testGetCode should return 'true'", "test".equals(se.getMessage()));
    }

}
