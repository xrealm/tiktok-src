package com.p280ss.android.ugc.aweme.net;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory */
public class MusicTypeAdapterFactory implements C6717s {
    public <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        if (!Music.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final C6715r a = eVar.mo15966a((C6717s) this, aVar);
        return new C6715r<T>() {
            public final T read(C6718a aVar) throws IOException {
                if (aVar.mo16088f() == JsonToken.NULL) {
                    aVar.mo16092j();
                    return null;
                }
                T t = (Music) a.read(aVar);
                C43077dz.m136657a().mo104731a(t.getOwnerId(), t.getSecUid());
                return t;
            }

            public final void write(C6720b bVar, T t) throws IOException {
                if (t == null) {
                    bVar.mo16115f();
                } else {
                    a.write(bVar, t);
                }
            }
        };
    }
}