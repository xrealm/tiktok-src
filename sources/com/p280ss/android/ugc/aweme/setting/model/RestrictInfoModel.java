package com.p280ss.android.ugc.aweme.setting.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.setting.api.RestrictApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.model.RestrictInfoModel */
public class RestrictInfoModel extends C34028a<RestrictInfo> {
    public void getRestrictInfo(final String str) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public Object call() throws Exception {
                return RestrictApi.m120341a(str);
            }
        }, 0);
    }
}
