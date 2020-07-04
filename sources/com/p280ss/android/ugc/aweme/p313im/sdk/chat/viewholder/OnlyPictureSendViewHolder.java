package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.CircleProgressTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.OnlyPictureSendViewHolder */
public class OnlyPictureSendViewHolder extends OnlyPictureViewHolder {

    /* renamed from: m */
    private C31033i f81250m;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
        this.f81202j.mo82725a(this.f81195c);
    }

    /* renamed from: f */
    private void m100974f() {
        if (this.f81201i.getMsgStatus() == 3) {
            this.f81195c.setTag(50331648, Integer.valueOf(6));
            this.f81195c.setTag(67108864, this.f81201i);
            this.f81195c.setImageResource(R.drawable.b5o);
            this.f81195c.setVisibility(0);
            return;
        }
        this.f81195c.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81195c = (ImageView) this.itemView.findViewById(R.id.dar);
        this.f81250m = new C31033i((CircleProgressTextView) this.itemView.findViewById(R.id.cl7), this.f81195c);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
    }

    public OnlyPictureSendViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, OnlyPictureContent onlyPictureContent, int i) {
        super.mo81421a(message, message2, onlyPictureContent, i);
        m100974f();
        this.f81250m.mo81501a(this.f81201i);
    }
}