package pl.kedrabartosz.designpatterns.builder;

public class Pot {
    public static void main(String[] args) {
        Pot pot = new Pot.PotBuilder()
                .setHydrationLevel(5.6)
                .setFlower()
                .setLightLevel(5.4)
                .setTypeOfGround("okej")
                .build();
    }


    private Flower flower;
    private String typeOfGround;
    private double lightLevel;
    private double hydrationLevel;

    public class Flower {
    }

    private Pot(PotBuilder potBuilder) {
        this.flower = potBuilder.flower;
        this.typeOfGround = potBuilder.typeOfGround;
        this.lightLevel = potBuilder.lightLevel;
        this.hydrationLevel = potBuilder.hydrationLevel;
    }

    public static class PotBuilder {
        private Flower flower;
        private String typeOfGround;
        private double lightLevel;
        private double hydrationLevel;


        public PotBuilder setFlower() {
            this.flower = flower;
            return this;
        }

        public PotBuilder setTypeOfGround(String typeOfGround) {
            this.typeOfGround = typeOfGround;
            return this;
        }

        public PotBuilder setLightLevel(double lightLevel) {
            this.lightLevel = lightLevel;
            return this;
        }

        public PotBuilder setHydrationLevel(double hydrationLevel) {
            this.hydrationLevel = hydrationLevel;
            return this;
        }

        public Pot build() {
            return new Pot(this);
        }
    }
}
