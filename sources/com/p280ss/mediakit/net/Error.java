package com.p280ss.mediakit.net;

/* renamed from: com.ss.mediakit.net.Error */
public class Error {
    int code;
    public String errStr;
    public String host;

    /* renamed from: id */
    public String f117292id;

    public Error(int i, String str, String str2) {
        this.code = i;
        this.host = str;
        this.f117292id = str2;
    }

    public Error(int i, String str, String str2, String str3) {
        this.code = i;
        this.host = str;
        this.f117292id = str2;
        this.errStr = str3;
    }
}
