package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$middlewareSelectSubscribeMapped$$inlined$let$lambda$1 */
public final class C11603x82ee7a74 extends Lambda implements C7562b<R, C7581n> {
    final /* synthetic */ boolean $force$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7562b $subscriber$inlined;
    final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
    final /* synthetic */ boolean $uniqueOnly$inlined;

    public C11603x82ee7a74(JediViewModel jediViewModel, C0043i iVar, boolean z, boolean z2, C7562b bVar) {
        this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$uniqueOnly$inlined = z;
        this.$force$inlined = z2;
        this.$subscriber$inlined = bVar;
        super(1);
    }

    public final void invoke(R r) {
        this.$subscriber$inlined.invoke(r);
    }
}
