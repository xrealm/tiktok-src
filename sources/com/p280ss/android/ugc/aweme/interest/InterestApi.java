package com.p280ss.android.ugc.aweme.interest;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.interest.InterestApi */
public interface InterestApi {

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestApi$a */
    public static final class C32146a {
    }

    @C7730f(mo20420a = "/aweme/v1/config/list/")
    C7492s<C32189f> getInterest(@C7744t(mo20436a = "type") String str);

    @C7729e
    @C7739o(mo20429a = "aweme/v1/user/interest/select/")
    C7492s<BaseResponse> uploadInterest(@C7727c(mo20417a = "selectedInterestList") String str);
}
