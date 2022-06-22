package com.bytehonor.sdk.beautify.html.error;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bytehonor.sdk.beautify.html.exception.HtmlBeautifyException;

public class HtmlBuilderSdkErrorTest {

    @Test
    public void testGetCode() {
        HtmlBeautifyException se = new HtmlBeautifyException("test");

        assertTrue("testGetCode should return 'true'", "test".equals(se.getMessage()));
    }

}
