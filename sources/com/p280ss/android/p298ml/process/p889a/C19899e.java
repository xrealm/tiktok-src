package com.p280ss.android.p298ml.process.p889a;

import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.e */
public final class C19899e implements C6835e {
    /* renamed from: a */
    public final void mo16695a(C6834d dVar) {
        HashMap<String, Object> hashMap = dVar.f19457a;
        C6833c cVar = dVar.f19460d;
        List<String> args = cVar.getArgs();
        List oPTs = cVar.getOPTs();
        for (String str : args) {
            Number number = (Number) hashMap.get(str);
            if (number != null) {
                hashMap.put(cVar.getFeature(), Float.valueOf(Math.min(number.floatValue(), ((Float) oPTs.get(0)).floatValue())));
            }
        }
    }
}
