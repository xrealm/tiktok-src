package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12821d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12843d;
import com.p280ss.android.ugc.aweme.account.C21169e;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.j */
public abstract class C21333j extends C12843d {

    /* renamed from: a */
    private C21336m f57313a;

    /* renamed from: a */
    public abstract void mo57353a(C12710e<C12821d> eVar);

    public abstract void onSuccess(C12710e<C12821d> eVar);

    public C21333j(C21336m mVar) {
        this.f57313a = mVar;
    }

    public void onError(C12710e<C12821d> eVar, int i) {
        mo57353a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12821d> eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f57313a.mo57354a(str, eVar.f33703c, C21169e.f56928m, new C21334k(this.f57313a, this, (C12821d) eVar.f33709g));
            return;
        }
        mo57353a(eVar);
    }
}
