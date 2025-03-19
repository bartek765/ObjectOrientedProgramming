package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise7;

sealed interface Coffee permits BlackCoffee, DecafCoffee, GrainCoffee {
    int affectEnergy();
}