package com.p280ss.android.ugc.aweme.share.systemshare;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.share.systemshare.c */
final class C38257c {
    /* renamed from: a */
    static ApplicationInfo m122217a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        TextUtils.equals(str, C6399b.m19921a().getPackageName());
        return packageManager.getApplicationInfo(str, 0);
    }
}
