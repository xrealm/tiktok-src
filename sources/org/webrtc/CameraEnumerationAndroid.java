package org.webrtc;

import android.graphics.ImageFormat;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size[]{new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, 640), new Size(PreloadTask.BYTE_UNIT_NUMBER, 576), new Size(PreloadTask.BYTE_UNIT_NUMBER, 600), new Size(1280, 720), new Size(1280, PreloadTask.BYTE_UNIT_NUMBER), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)}));

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("[");
                sb.append(((float) this.min) / 1000.0f);
                sb.append(":");
                sb.append(((float) this.max) / 1000.0f);
                sb.append("]");
                return sb.toString();
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min == framerateRange.min && this.max == framerateRange.max) {
                    return true;
                }
                return false;
            }

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.width);
            sb.append("x");
            sb.append(this.height);
            sb.append("@");
            sb.append(this.framerate);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate)) {
                return true;
            }
            return false;
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }
    }

    static abstract class ClosestComparator<T> implements Comparator<T> {
        private ClosestComparator() {
        }

        /* access modifiers changed from: 0000 */
        public abstract int diff(T t);

        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }
    }

    public static FramerateRange getClosestSupportedFramerateRange(List<FramerateRange> list, final int i) {
        return (FramerateRange) Collections.min(list, new ClosestComparator<FramerateRange>() {
            private int progressivePenalty(int i, int i2, int i3, int i4) {
                return i < i2 ? i * i3 : (i3 * i2) + ((i - i2) * i4);
            }

            /* access modifiers changed from: 0000 */
            public int diff(FramerateRange framerateRange) {
                return progressivePenalty(Math.abs((i * 1000) - framerateRange.min), 5000, 1, 3) + progressivePenalty(Math.abs((i * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() {
            /* access modifiers changed from: 0000 */
            public int diff(Size size) {
                return Math.abs(i - size.width) + Math.abs(i2 - size.height);
            }
        });
    }
}
