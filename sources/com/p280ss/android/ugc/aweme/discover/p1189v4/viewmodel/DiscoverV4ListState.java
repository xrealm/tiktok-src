package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState */
public final class DiscoverV4ListState implements C11670t {
    private final ListState<DiscoverCategoryStructV4, C11583n> cells;

    public DiscoverV4ListState() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.n>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState copy$default(com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState r0, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.C11583n> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.n> r1 = r0.cells
        L_0x0006:
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState.copy$default(com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState");
    }

    public final ListState<DiscoverCategoryStructV4, C11583n> component1() {
        return this.cells;
    }

    public final DiscoverV4ListState copy(ListState<DiscoverCategoryStructV4, C11583n> listState) {
        C7573i.m23587b(listState, "cells");
        return new DiscoverV4ListState(listState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.cells, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState) r2).cells) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState r2 = (com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState) r2
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.n> r0 = r1.cells
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.n> r2 = r2.cells
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState.equals(java.lang.Object):boolean");
    }

    public final ListState<DiscoverCategoryStructV4, C11583n> getCells() {
        return this.cells;
    }

    public final int hashCode() {
        ListState<DiscoverCategoryStructV4, C11583n> listState = this.cells;
        if (listState != null) {
            return listState.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4ListState(cells=");
        sb.append(this.cells);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4ListState(ListState<DiscoverCategoryStructV4, C11583n> listState) {
        C7573i.m23587b(listState, "cells");
        this.cells = listState;
    }

    public /* synthetic */ DiscoverV4ListState(ListState listState, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            listState = new ListState(new C11583n(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(listState);
    }
}
