package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ar */
final class C5593ar {
    /* renamed from: a */
    static void m18006a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            popupWindow.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
