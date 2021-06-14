package ru.begletsov.patterns.builder.builder2;

public class BuilderApp {
    public static void main(String[] args) {

        Car brutalCar = new Car.Builder(Brand.BMW, "X6").withBody(Body.HATCHBACK)
                .withColor(Color.BLACK).withTuning(Tuning.LEATHER).withWheels(Wheels.STEEL).build();

        System.out.println(brutalCar.toString());;

        Car premiumCar = new Car.Builder(Brand.MERCEDES, "E200").withBody(Body.SEDAN)
                .withColor(Color.WHITE).withTuning(Tuning.WHITE).withWheels(Wheels.SPORTS).build();

        System.out.println(premiumCar.toString());;
    }
}
