package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod_LifecycleAdapter */
public class OpenFeedsFlowMethod_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final OpenFeedsFlowMethod f73516a;

    OpenFeedsFlowMethod_LifecycleAdapter(OpenFeedsFlowMethod openFeedsFlowMethod) {
        this.f73516a = openFeedsFlowMethod;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Event.ON_DESTROY) {
            if (!z2 || nVar.mo124a("onDestroy", 1)) {
                this.f73516a.onDestroy();
            }
        }
    }
}
