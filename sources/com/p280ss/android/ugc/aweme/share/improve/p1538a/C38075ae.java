package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ae */
public final class C38075ae implements C38389f {

    /* renamed from: a */
    private final Music f99129a;

    /* renamed from: b */
    public final String mo95715b() {
        return "report_music";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.df8;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final int mo95710a() {
        if (C37196b.m119569b()) {
            return R.drawable.atz;
        }
        return R.drawable.aty;
    }

    public C38075ae(Music music) {
        C7573i.m23587b(music, "music");
        this.f99129a = music;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C37196b.m119562a(C38157b.m121903a(context), "music", this.f99129a.getMid(), this.f99129a.getOwnerId());
        C37196b.m119565a("", "music", "", this.f99129a.getMid(), this.f99129a.getOwnerId(), "", "click_share_button");
    }
}
