package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.ce */
final /* synthetic */ class C44266ce extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114422a = new C44266ce();

    C44266ce() {
    }

    public final String getName() {
        return "chooseMusicIcon";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditToolbarState.class);
    }

    public final String getSignature() {
        return "getChooseMusicIcon()Landroid/graphics/drawable/Drawable;";
    }

    public final Object get(Object obj) {
        return ((EditToolbarState) obj).getChooseMusicIcon();
    }
}