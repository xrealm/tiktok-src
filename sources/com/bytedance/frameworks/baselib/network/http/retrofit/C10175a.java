package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.ugc.aweme.p759ac.C15459b;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a */
final class C10175a {
    /* renamed from: a */
    static C12534t m30236a(BaseSsInterceptor baseSsInterceptor, C12470a aVar) throws Exception {
        if (!(aVar.mo30458b() instanceof C15459b)) {
            return baseSsInterceptor.mo24873b(aVar);
        }
        C15459b bVar = (C15459b) aVar.mo30458b();
        if (bVar.f39780t > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f39780t;
            bVar.mo39012a(bVar.f39782v, uptimeMillis);
            bVar.mo39013b(bVar.f39782v, uptimeMillis);
        }
        bVar.mo39011a(baseSsInterceptor.getClass().getSimpleName());
        bVar.f39780t = SystemClock.uptimeMillis();
        C12534t b = baseSsInterceptor.mo24873b(aVar);
        if (bVar.f39781u > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f39781u;
            String simpleName = baseSsInterceptor.getClass().getSimpleName();
            bVar.mo39012a(simpleName, uptimeMillis2);
            bVar.mo39014c(simpleName, uptimeMillis2);
        }
        bVar.f39781u = SystemClock.uptimeMillis();
        return b;
    }
}
