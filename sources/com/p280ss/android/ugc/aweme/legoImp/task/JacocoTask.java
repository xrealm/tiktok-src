package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p1702w.C43392a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.JacocoTask */
public class JacocoTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        if (C6776h.m20947b(context)) {
            C43392a.m137710a(context);
        }
    }
}
