package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;

@ReactModule(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends ReactContextBaseJavaModule {
    private CaptureCallback mCaptureInProgress;

    public interface CaptureCallback {
        void onFailure(CaptureException captureException);

        void onSuccess(File file);
    }

    public static class CaptureException extends Exception {
        CaptureException(String str) {
            super(str);
        }

        CaptureException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    public String getName() {
        return "JSCHeapCapture";
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public synchronized void captureComplete(String str, String str2) {
        if (this.mCaptureInProgress != null) {
            if (str2 == null) {
                this.mCaptureInProgress.onSuccess(new File(str));
            } else {
                this.mCaptureInProgress.onFailure(new CaptureException(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, CaptureCallback captureCallback) {
        if (this.mCaptureInProgress != null) {
            captureCallback.onFailure(new CaptureException("Heap capture already in progress."));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/capture.json");
        File file = new File(sb.toString());
        file.delete();
        HeapCapture heapCapture = (HeapCapture) getReactApplicationContext().getJSModule(HeapCapture.class);
        if (heapCapture == null) {
            captureCallback.onFailure(new CaptureException("Heap capture js module not registered."));
            return;
        }
        this.mCaptureInProgress = captureCallback;
        heapCapture.captureHeap(file.getPath());
    }
}
