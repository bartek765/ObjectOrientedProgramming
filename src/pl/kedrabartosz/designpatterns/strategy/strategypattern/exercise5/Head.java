package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise5;

class Head {
    private int hairLength = 10;

    void applyShampoo(Shampoo shampoo) {
        hairLength += shampoo.affectHairLength();
        if (hairLength < 0) hairLength = 0;
        System.out.println("Po użyciu szamponu długość włosów: " + hairLength + " cm");
    }
}