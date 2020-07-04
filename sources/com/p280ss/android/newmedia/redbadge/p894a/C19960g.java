package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p896c.C19981a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.g */
public class C19960g implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
            intent.putExtra("com.htc.launcher.extra.COUNT", i);
            Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
            intent2.putExtra("packagename", componentName.getPackageName());
            intent2.putExtra("count", i);
            if (C19981a.m65883a(context, intent) || C19981a.m65883a(context, intent2)) {
                try {
                    context.sendBroadcast(intent);
                    context.sendBroadcast(intent2);
                } catch (Throwable th) {
                    throw new RedBadgerException(th.getMessage());
                }
            } else {
                StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                sb.append(intent2.toString());
                throw new RedBadgerException(sb.toString());
            }
        }
    }
}
