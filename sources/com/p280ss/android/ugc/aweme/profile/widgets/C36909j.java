package com.p280ss.android.ugc.aweme.profile.widgets;

import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.j */
final /* synthetic */ class C36909j extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f96721a = new C36909j();

    C36909j() {
    }

    public final String getName() {
        return "curTabType";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ProfileState.class);
    }

    public final String getSignature() {
        return "getCurTabType()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((ProfileState) obj).getCurTabType());
    }
}
