package com.ttnet.org.chromium.net1;

import com.ttnet.org.chromium.net1.NetworkChangeNotifierAutoDetect.RegistrationPolicy;

public class RegistrationPolicyAlwaysRegister extends RegistrationPolicy {
    /* access modifiers changed from: protected */
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        register();
    }
}
