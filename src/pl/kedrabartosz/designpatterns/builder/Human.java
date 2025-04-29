package pl.kedrabartosz.designpatterns.builder;

import java.time.Instant;

public class Human {
    public static void main(String[] args) {
        Human human = new HumanBuilder()
                .setCoffee()
                .setEnergyLevel(55)
                .setLastTimeHadCoffee(Instant.now())
                .build();
    }


    private Coffee coffee;
    private int energyLevel;
    private Instant lastTimeHadCoffee;

    public class Coffee {
    }

    private Human(HumanBuilder humanBuilder) {
        this.coffee = humanBuilder.coffee;
        this.energyLevel = humanBuilder.energyLevel;
        this.lastTimeHadCoffee = humanBuilder.lastTimeHadCoffee;
    }

    public static class HumanBuilder {
        private Coffee coffee;
        private int energyLevel;
        private Instant lastTimeHadCoffee;

        public HumanBuilder setCoffee() {
            this.coffee = coffee;
            return this;
        }

        public HumanBuilder setEnergyLevel(int energyLevel) {
            this.energyLevel = energyLevel;
            return this;
        }

        public HumanBuilder setLastTimeHadCoffee(Instant lastTimeHadCoffee) {
            this.lastTimeHadCoffee = lastTimeHadCoffee;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
}
