package com.p280ss.android.ugc.gamora.recorder.progress;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.d */
final /* synthetic */ class C44715d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115093a = new C44715d();

    C44715d() {
    }

    public final String getName() {
        return "progressClipAnchors";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordProgressState.class);
    }

    public final String getSignature() {
        return "getProgressClipAnchors()Lkotlin/Pair;";
    }

    public final Object get(Object obj) {
        return ((RecordProgressState) obj).getProgressClipAnchors();
    }
}
