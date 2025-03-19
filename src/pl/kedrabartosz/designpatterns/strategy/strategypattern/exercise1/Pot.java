package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise1;

class Pot {
    private Flower flower;

    public void plantFlower(Flower flower) {
        this.flower = flower;
    }

    public void displayFlower() {
        if (flower != null) {
            System.out.println("W doniczce rośnie: " + flower.getName() + ", kolor: " + flower.getColor());
        } else {
            System.out.println("Doniczka jest pusta.");
        }
    }
}

