package com.p280ss.android.ugc.aweme.newfollow.userstate;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowImageViewHolderPlanD;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateInsFollowImageViewHolderPlanD */
public final class UserStateInsFollowImageViewHolderPlanD extends InsFollowImageViewHolderPlanD {

    /* renamed from: d */
    public final boolean f89125d;

    /* renamed from: h */
    public final int mo68523h() {
        return 5;
    }

    /* renamed from: i */
    public final String mo68524i() {
        return "from_user_state_tab";
    }

    /* renamed from: r */
    public final String mo75290r() {
        if (this.f89125d) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: g */
    public final String mo68522g() {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C7573i.m23582a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateInsFollowImageViewHolderPlanD(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar, boolean z) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f89125d = z;
    }
}
