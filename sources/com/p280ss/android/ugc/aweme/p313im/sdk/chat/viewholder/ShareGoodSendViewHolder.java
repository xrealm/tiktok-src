package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodSendViewHolder */
public class ShareGoodSendViewHolder extends ShareGoodViewHolder {

    /* renamed from: m */
    private C31050o f81338m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81195c = (ImageView) mo81425a((int) R.id.dar);
        this.f81338m = new C31050o(this.f81195c);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81195c);
    }

    public ShareGoodSendViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        this.f81338m.mo81521a(this.f81201i);
    }
}
