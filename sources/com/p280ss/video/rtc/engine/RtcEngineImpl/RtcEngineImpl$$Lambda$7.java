package com.p280ss.video.rtc.engine.RtcEngineImpl;

import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$7 */
final /* synthetic */ class RtcEngineImpl$$Lambda$7 implements Runnable {
    private final C46266RtcEngineImpl arg$1;
    private final VideoFrame arg$2;

    RtcEngineImpl$$Lambda$7(C46266RtcEngineImpl rtcEngineImpl, VideoFrame videoFrame) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = videoFrame;
    }

    public final void run() {
        this.arg$1.lambda$pushExternalVideoFrame$7$RtcEngineImpl(this.arg$2);
    }
}