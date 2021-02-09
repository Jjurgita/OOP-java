package bit.obj.p14.enum_notes.class_work;

public class Sviesoforas {
    private Position position;
    private Color color;
    private boolean active;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Sviesoforas{" +
                "position=" + position +
                ", color=" + (color == null ? '-' : color.name() +
                " (" + color.ordinal() + ") ") + color +
                ", active=" + active +
                '}';
    }
}
