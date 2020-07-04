package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtView */
public final class AVDmtView extends View {
    public AVDmtView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AVDmtView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        Drawable a = C42111b.f109618a.mo103544a(context, attributeSet);
        if (a != null) {
            setBackground(a);
        }
    }

    public /* synthetic */ AVDmtView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
