package pl.kedrabartosz.designpatterns.exercise.coffee;

class Barista {
    public void serve(Coffee coffee) {
        System.out.println("Barista serves: " + coffee.getDescription());
    }
}
