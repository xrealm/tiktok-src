package com.squareup.okhttp.internal.framed;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class Ping {
    private final CountDownLatch latch = new CountDownLatch(1);
    private long received = -1;
    private long sent = -1;

    public final long roundTripTime() throws InterruptedException {
        this.latch.await();
        return this.received - this.sent;
    }

    Ping() {
    }

    /* access modifiers changed from: 0000 */
    public final void receive() {
        if (this.received != -1 || this.sent == -1) {
            throw new IllegalStateException();
        }
        this.received = System.nanoTime();
        this.latch.countDown();
    }

    /* access modifiers changed from: 0000 */
    public final void send() {
        if (this.sent == -1) {
            this.sent = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: 0000 */
    public final void cancel() {
        if (this.received != -1 || this.sent == -1) {
            throw new IllegalStateException();
        }
        this.received = this.sent - 1;
        this.latch.countDown();
    }

    public final long roundTripTime(long j, TimeUnit timeUnit) throws InterruptedException {
        if (this.latch.await(j, timeUnit)) {
            return this.received - this.sent;
        }
        return -2;
    }
}
