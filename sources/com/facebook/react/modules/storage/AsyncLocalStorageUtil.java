package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class AsyncLocalStorageUtil {
    static String buildKeySelection(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        StringBuilder sb = new StringBuilder("key IN (");
        sb.append(TextUtils.join(", ", strArr));
        sb.append(")");
        return sb.toString();
    }

    private static void deepMergeInto(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(str);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(str, jSONObject2.get(str));
            } else {
                deepMergeInto(optJSONObject2, optJSONObject);
                jSONObject.put(str, optJSONObject2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static String getItemImpl(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    static String[] buildKeySelectionArgs(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    static boolean mergeImpl(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String itemImpl = getItemImpl(sQLiteDatabase, str);
        if (itemImpl != null) {
            JSONObject jSONObject = new JSONObject(itemImpl);
            deepMergeInto(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return setItemImpl(sQLiteDatabase, str, str2);
    }

    static boolean setItemImpl(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        if (-1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5)) {
            return true;
        }
        return false;
    }
}
