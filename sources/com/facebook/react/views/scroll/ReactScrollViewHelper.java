package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

public class ReactScrollViewHelper {
    public static void emitScrollBeginDragEvent(ViewGroup viewGroup) {
        emitScrollEvent(viewGroup, ScrollEventType.BEGIN_DRAG);
    }

    public static void emitScrollMomentumEndEvent(ViewGroup viewGroup) {
        emitScrollEvent(viewGroup, ScrollEventType.MOMENTUM_END);
    }

    public static int parseOverScrollMode(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        StringBuilder sb = new StringBuilder("wrong overScrollMode: ");
        sb.append(str);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    private static void emitScrollEvent(ViewGroup viewGroup, ScrollEventType scrollEventType) {
        emitScrollEvent(viewGroup, scrollEventType, 0.0f, 0.0f);
    }

    public static void emitScrollEndDragEvent(ViewGroup viewGroup, float f, float f2) {
        emitScrollEvent(viewGroup, ScrollEventType.END_DRAG, f, f2);
    }

    public static void emitScrollEvent(ViewGroup viewGroup, float f, float f2) {
        emitScrollEvent(viewGroup, ScrollEventType.SCROLL, f, f2);
    }

    public static void emitScrollMomentumBeginEvent(ViewGroup viewGroup, int i, int i2) {
        emitScrollEvent(viewGroup, ScrollEventType.MOMENTUM_BEGIN, (float) i, (float) i2);
    }

    private static void emitScrollEvent(ViewGroup viewGroup, ScrollEventType scrollEventType, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            ((UIManagerModule) ((ReactContext) viewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(ScrollEvent.obtain(viewGroup.getId(), scrollEventType, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }
}
