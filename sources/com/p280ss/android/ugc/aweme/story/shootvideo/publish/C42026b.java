package com.p280ss.android.ugc.aweme.story.shootvideo.publish;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.b */
public final class C42026b {

    /* renamed from: a */
    protected static char[] f109152a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m133582a(String str) {
        if (str == null) {
            return null;
        }
        return m133583a(str.getBytes());
    }

    /* renamed from: a */
    public static String m133581a(File file) {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    return m133584b(instance.digest());
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m133583a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(f109152a[(b & 240) >> 4]);
                stringBuffer.append(f109152a[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m133584b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
