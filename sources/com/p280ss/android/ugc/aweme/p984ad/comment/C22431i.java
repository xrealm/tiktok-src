package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.i */
final class C22431i {
    /* renamed from: a */
    static void m74279a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
