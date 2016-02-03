package com.github.hathibelagal.pn;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

public class TokenRefreshListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {
        Intent i = new Intent(this, RegistrationService.class);
        startService(i);
    }

}
