package day4.association.composition;
class Engine{
    void Start(){
        System.out.println(" V8 Engine Starts");
    }
}

public class Car {
    private Engine engine;
    Car(){
        engine = new Engine();
    }
    void drive(){
        engine.Start();
        System.out.println("car is moving");
    }

    public static void main(String[] args) {
        Car car= new Car();
        car.drive();
    }
}
