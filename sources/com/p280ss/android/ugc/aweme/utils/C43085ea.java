package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.widget.Toast;

/* renamed from: com.ss.android.ugc.aweme.utils.ea */
final class C43085ea {
    /* renamed from: a */
    static void m136675a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
