package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState */
public final class ProfileCollectionState implements C11670t {
    private final String enterFrom;
    private final ListState<C27707j, C11583n> profileCollectionItemStructListState;

    public ProfileCollectionState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.a.j, com.bytedance.jedi.arch.ext.list.n>, for r2v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState copy$default(com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState r0, java.lang.String r1, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j, com.bytedance.jedi.arch.ext.list.C11583n> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.enterFrom
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.a.j, com.bytedance.jedi.arch.ext.list.n> r2 = r0.profileCollectionItemStructListState
        L_0x000c:
            com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState.copy$default(com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState, java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState");
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final ListState<C27707j, C11583n> component2() {
        return this.profileCollectionItemStructListState;
    }

    public final ProfileCollectionState copy(String str, ListState<C27707j, C11583n> listState) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(listState, "profileCollectionItemStructListState");
        return new ProfileCollectionState(str, listState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.profileCollectionItemStructListState, (java.lang.Object) r3.profileCollectionItemStructListState) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState r3 = (com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState) r3
            java.lang.String r0 = r2.enterFrom
            java.lang.String r1 = r3.enterFrom
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.a.j, com.bytedance.jedi.arch.ext.list.n> r0 = r2.profileCollectionItemStructListState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.a.j, com.bytedance.jedi.arch.ext.list.n> r3 = r3.profileCollectionItemStructListState
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState.equals(java.lang.Object):boolean");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final ListState<C27707j, C11583n> getProfileCollectionItemStructListState() {
        return this.profileCollectionItemStructListState;
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<C27707j, C11583n> listState = this.profileCollectionItemStructListState;
        if (listState != null) {
            i = listState.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCollectionState(enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", profileCollectionItemStructListState=");
        sb.append(this.profileCollectionItemStructListState);
        sb.append(")");
        return sb.toString();
    }

    public ProfileCollectionState(String str, ListState<C27707j, C11583n> listState) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(listState, "profileCollectionItemStructListState");
        this.enterFrom = str;
        this.profileCollectionItemStructListState = listState;
    }

    public /* synthetic */ ProfileCollectionState(String str, ListState listState, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            listState = new ListState(new C11583n(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(str, listState);
    }
}
