package com.bytedance.crash.p501j.p502a;

import android.content.Context;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9996p;

/* renamed from: com.bytedance.crash.j.a.a */
final class C9920a extends C9924c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24532a() {
        return true;
    }

    /* renamed from: a */
    public final C9896a mo24531a(C9896a aVar) {
        C9896a a = super.mo24531a(aVar);
        C9898c a2 = C9898c.m29248a(this.f27098b);
        C9898c.m29250a(a2);
        C9898c.m29253b(a2);
        a2.mo24509a(C9918j.m29332a().mo24525a());
        a2.mo24508a(C9918j.m29338c().mo24593a());
        a2.mo24507a(C9918j.m29332a().mo24530f());
        a.mo24484a(a2);
        a.mo24492a("process_name", (Object) C9972a.m29507c(this.f27098b));
        C9996p.m29626a(a, a2, this.f27097a);
        return a;
    }

    C9920a(Context context, C9921b bVar, C9926d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }
}
