package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_link_ad_migration")
/* renamed from: com.ss.android.ugc.aweme.experiment.LinkMigrationExperiment */
public final class LinkMigrationExperiment {
    @C6382b
    public static final boolean DISABLE = false;
    @C6382b(mo15285a = true)
    public static final boolean ENABLE = true;
    public static final LinkMigrationExperiment INSTANCE = new LinkMigrationExperiment();

    private LinkMigrationExperiment() {
    }
}