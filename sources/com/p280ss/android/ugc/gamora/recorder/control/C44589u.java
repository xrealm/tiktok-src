package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.u */
final /* synthetic */ class C44589u extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114895a = new C44589u();

    C44589u() {
    }

    public final String getName() {
        return "uploadVisibility";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getUploadVisibility()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getUploadVisibility();
    }
}
