package com.p280ss.android.ugc.gamora.recorder.progress;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.e */
final /* synthetic */ class C44716e extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115094a = new C44716e();

    C44716e() {
    }

    public final String getName() {
        return "progressMaxDuration";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordProgressState.class);
    }

    public final String getSignature() {
        return "getProgressMaxDuration()J";
    }

    public final Object get(Object obj) {
        return Long.valueOf(((RecordProgressState) obj).getProgressMaxDuration());
    }
}
