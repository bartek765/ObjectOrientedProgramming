package pl.kedrabartosz.designpatterns.exercise.coffee;

class AddOn implements Coffee {
    private Coffee coffee;
    private String addOn;

    public AddOn(Coffee coffee, String addOn) {
        this.coffee = coffee;
        this.addOn = addOn;
    }

    public String getDescription() {
        return coffee.getDescription() + " with " + addOn;
    }
}