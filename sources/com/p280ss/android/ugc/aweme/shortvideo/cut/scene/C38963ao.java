package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao */
final /* synthetic */ class C38963ao extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f101184a = new C38963ao();

    C38963ao() {
    }

    public final String getName() {
        return "quitEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(CutVideoState.class);
    }

    public final String getSignature() {
        return "getQuitEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoState) obj).getQuitEvent();
    }
}
