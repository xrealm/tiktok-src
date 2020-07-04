package com.p280ss.ttuploader.net;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.net.TTVNetClient */
public abstract class TTVNetClient {

    /* renamed from: com.ss.ttuploader.net.TTVNetClient$CompletionListener */
    public interface CompletionListener {
        void onCompletion(JSONObject jSONObject, Error error);
    }

    public void cancel() {
    }

    public void startTask(String str, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, CompletionListener completionListener) {
    }
}
