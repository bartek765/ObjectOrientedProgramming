package pl.kedrabartosz.designpatterns.builder;

public class Head {
    public static void main(String[] args) {
        Head head = new Head.HeadBuilder()
                .setColour("blue")
                .setLength(5)
                .setShampoo()
                .setThickness(4.55)
                .build();
    }

    private int length;
    private Shampoo shampoo;
    private String colour;
    private double thickness;

    class Shampoo {
    }

    private Head(HeadBuilder headBuilder) {
        this.length = headBuilder.length;
        this.shampoo = headBuilder.shampoo;
        this.colour = headBuilder.colour;
        this.thickness = headBuilder.thickness;
    }

    public static class HeadBuilder {
        private int length;
        private Shampoo shampoo;
        private String colour;
        private double thickness;

        public HeadBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public HeadBuilder setShampoo() {
            this.shampoo = shampoo;
            return this;
        }

        public HeadBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public HeadBuilder setThickness(double thickness) {
            this.thickness = thickness;
            return this;
        }

        public Head build() {
            return new Head(this);
        }
    }
}
