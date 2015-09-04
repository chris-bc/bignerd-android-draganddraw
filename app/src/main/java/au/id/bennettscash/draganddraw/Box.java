package au.id.bennettscash.draganddraw;

import android.graphics.PointF;

/**
 * Created by chris on 4/09/15.
 */
public class Box {
    private PointF origin;
    private PointF current;

    public Box(PointF origin) {
        this.origin = this.current = origin;
    }

    public PointF getCurrent() { return current; }
    public void setCurrent(PointF current) { this.current = current; }
    public PointF getOrigin() { return origin; }
}
