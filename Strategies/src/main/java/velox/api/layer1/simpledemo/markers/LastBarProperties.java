package velox.api.layer1.simpledemo.markers;

import java.awt.Color;

public class LastBarProperties {
    private int height;
    private Color color;
    private int currentTrendDetectionHealth;
    private boolean isFirst;

    public LastBarProperties() {
        isFirst = true;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentTrendDetectionHealth() {
        return currentTrendDetectionHealth;
    }

    public void setCurrentTrendDetectionHealth(int currentTrendDetectionHealth) {
        this.currentTrendDetectionHealth = currentTrendDetectionHealth;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public void decreaseCurrentTrendDetectionHealth() {
        currentTrendDetectionHealth--;
    }
}
