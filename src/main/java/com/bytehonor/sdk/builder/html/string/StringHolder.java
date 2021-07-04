package com.bytehonor.sdk.builder.html.string;

/**
 * @author lijianqiang
 *
 */
public final class StringHolder {

    private StringBuilder sb;

    private StringHolder() {
        this.sb = new StringBuilder();
    }

    public static StringHolder create() {
        return new StringHolder();
    }

    public StringHolder append(Object val) {
        if (val != null) {
            sb.append(val);
        }
        return this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
