package kotlin.p1884io;

import java.io.File;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.NoSuchFileException */
public final class NoSuchFileException extends FileSystemException {
    public NoSuchFileException(File file, File file2, String str) {
        C7573i.m23587b(file, "file");
        super(file, file2, str);
    }

    public /* synthetic */ NoSuchFileException(File file, File file2, String str, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            file2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(file, file2, str);
    }
}
