package kotlinx.coroutines.channels;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C7540d(mo19421b = "Channels.common.kt", mo19422c = {2520, 2520}, mo19423d = "associate", mo19424e = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt")
public final class ChannelsKt__Channels_commonKt$associate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$associate$1(C47919b bVar) {
        super(bVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C48136c.m149292c(null, null, this);
    }
}
