package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.du */
public final class C8590du implements C2265b<C8475ac> {
    /* renamed from: b */
    private static C8475ac m25835b(C2272g gVar) throws Exception {
        return m25834a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25835b(gVar);
    }

    /* renamed from: a */
    private static C8475ac m25834a(C2272g gVar) throws Exception {
        C8475ac acVar = new C8475ac();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        acVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        acVar.f23199a = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return acVar;
            }
        }
    }
}
