package com.ttnet.org.chromium.net1;

import com.ttnet.org.chromium.base1.ApplicationStatus;
import com.ttnet.org.chromium.base1.ApplicationStatus.ApplicationStateListener;
import com.ttnet.org.chromium.net1.NetworkChangeNotifierAutoDetect.RegistrationPolicy;

public class RegistrationPolicyApplicationStatus extends RegistrationPolicy implements ApplicationStateListener {
    private boolean mDestroyed;

    /* access modifiers changed from: 0000 */
    public int getApplicationState() {
        return ApplicationStatus.getStateForApplication();
    }

    /* access modifiers changed from: protected */
    public void destroy() {
        if (!this.mDestroyed) {
            ApplicationStatus.unregisterApplicationStateListener(this);
            this.mDestroyed = true;
        }
    }

    /* access modifiers changed from: protected */
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        ApplicationStatus.registerApplicationStateListener(this);
        onApplicationStateChange(getApplicationState());
    }

    public void onApplicationStateChange(int i) {
        if (i == 1) {
            register();
            return;
        }
        if (i == 2) {
            unregister();
        }
    }
}
