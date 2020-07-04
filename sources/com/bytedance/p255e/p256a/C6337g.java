package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6331b;
import com.bytedance.p255e.p256a.C6329c.C6332c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.e.a.g */
public final class C6337g extends C6332c {
    public C6337g(C6336f fVar, C6331b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f18577a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f18579c + (j * ((long) bVar.f18581e));
        this.f18586a = fVar.mo15171b(allocate, j2);
        this.f18587b = fVar.mo15171b(allocate, 4 + j2);
        this.f18588c = fVar.mo15171b(allocate, 8 + j2);
        this.f18589d = fVar.mo15171b(allocate, j2 + 20);
    }
}
