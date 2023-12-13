public class Room {
    private double area;
    private String wallColor;
    private boolean hasFurniture;

    public double getArea() {
        return area;
    }

    public String getWallColor() {
        return wallColor;
    }

    public boolean hasFurniture() {
        return hasFurniture;
    }

    private Room(Builder builder) {
        this.area = builder.area;
        this.wallColor = builder.wallColor;
        this.hasFurniture = builder.hasFurniture;
    }

    public static class Builder {
        private double area;
        private String wallColor;
        private boolean hasFurniture;

        public Builder area(double area) {
            this.area = area;
            return this;
        }

        public Builder wallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public Builder hasFurniture(boolean hasFurniture) {
            this.hasFurniture = hasFurniture;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
}