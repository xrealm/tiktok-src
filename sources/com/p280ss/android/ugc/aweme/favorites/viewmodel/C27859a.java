package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.a */
final /* synthetic */ class C27859a extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f73432a = new C27859a();

    C27859a() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(MediaMixState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((MediaMixState) obj).getListState();
    }
}
