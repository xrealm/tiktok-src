package com.p280ss.android.ugc.asve.recorder.camera.p925c;

import android.content.Context;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.c */
public final class C20717c extends C20714a {

    /* renamed from: e */
    private final C20707b f55955e;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.c.c$a */
    public static final class C20718a implements C19662d {

        /* renamed from: a */
        final /* synthetic */ C19662d f55956a;

        C20718a(C19662d dVar) {
            this.f55956a = dVar;
        }

        /* renamed from: a */
        public final void mo52271a(int i) {
            C19662d dVar = this.f55956a;
            if (dVar != null) {
                dVar.mo52271a(i);
            }
        }

        /* renamed from: a */
        public final void mo52272a(int i, int i2, String str) {
            C7573i.m23587b(str, "info");
            C19662d dVar = this.f55956a;
            if (dVar != null) {
                dVar.mo52272a(i, i2, str);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo56016b(boolean z) {
        return !z;
    }

    /* renamed from: c */
    public final boolean mo56017c() {
        return true;
    }

    /* renamed from: a */
    public final int mo56011a() {
        if (this.f55950c) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo56013a(boolean z) {
        this.f55949b = true;
        this.f55950c = z;
    }

    public C20717c(C20707b bVar, C20726i iVar) {
        C7573i.m23587b(bVar, "mCameraService");
        C7573i.m23587b(iVar, "wideCameraComponent");
        super(iVar);
        this.f55955e = bVar;
    }

    /* renamed from: a */
    public final void mo56012a(Context context, C19662d dVar) {
        int i;
        C7573i.m23587b(context, "context");
        C20707b bVar = this.f55955e;
        if (this.f55950c) {
            i = 0;
        } else {
            i = 2;
        }
        bVar.mo55931a(i, (C19662d) new C20718a(dVar));
        this.f55950c = !this.f55950c;
        this.f55955e.mo55962i().mo56022a(this.f55950c);
    }
}
