package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import java.sql.Time;

class TimeTypeAdapter$1 implements C6717s {
    TimeTypeAdapter$1() {
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        if (aVar.rawType == Time.class) {
            return new C6647h();
        }
        return null;
    }
}
