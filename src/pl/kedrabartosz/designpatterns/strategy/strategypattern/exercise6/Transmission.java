package pl.kedrabartosz.designpatterns.strategy.strategypattern.exercise6;

sealed interface Transmission permits AutomaticTransmission, ManualTransmission {
    String getType();
}
