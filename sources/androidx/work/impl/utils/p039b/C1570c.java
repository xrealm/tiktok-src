package androidx.work.impl.utils.p039b;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.work.impl.utils.b.c */
final class C1570c {
    /* renamed from: a */
    static ExecutorService m7662a(ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18995a(threadFactory).mo18996a());
    }
}
