package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fe */
public final class C8628fe implements C2265b<C8513bi> {
    /* renamed from: b */
    private static C8513bi m25909b(C2272g gVar) throws Exception {
        return m25908a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25909b(gVar);
    }

    /* renamed from: a */
    private static C8513bi m25908a(C2272g gVar) throws Exception {
        C8513bi biVar = new C8513bi();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        biVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        biVar.f23388a = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return biVar;
            }
        }
    }
}