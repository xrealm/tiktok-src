package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

public final class SimpleListMiddlewareKt$NonPayloadCommonListMiddleware$1 extends Lambda implements C7562b<S, C7492s<Pair<? extends List<? extends T>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $actualRefresh;

    public SimpleListMiddlewareKt$NonPayloadCommonListMiddleware$1(C7562b bVar) {
        this.$actualRefresh = bVar;
        super(1);
    }

    public final C7492s<Pair<List<T>, C11583n>> invoke(S s) {
        C7573i.m23587b(s, "state");
        C7492s<Pair<List<T>, C11583n>> d = ((C7492s) this.$actualRefresh.invoke(s)).mo19317d((C7327h<? super T, ? extends R>) C115481.f31210a);
        C7573i.m23582a((Object) d, "actualRefresh(state).map { it to null }");
        return d;
    }
}
