package com.p280ss.p811a.p812a;

import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.ss.a.a.c */
final class C18878c {
    /* renamed from: a */
    static InputStream m61630a(HttpURLConnection httpURLConnection) throws IOException {
        URLConnection uRLConnection = httpURLConnection;
        if (C7118e.m22232a(uRLConnection)) {
            C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        } else if (C7163a.m22363a()) {
            C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        }
        return httpURLConnection.getInputStream();
    }

    /* renamed from: a */
    static void m61631a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C7118e.m22232a(uRLConnection)) {
            C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
        } else if (C7163a.m22363a()) {
            C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.addRequestProperty(str, str2);
    }
}
