package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.an */
final class C5191an {
    /* renamed from: a */
    public static void m16814a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C5191an.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
