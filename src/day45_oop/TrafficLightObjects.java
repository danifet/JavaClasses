package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.changeColor ("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.color = "black";
        trafficLight2.showColor();
    }

}
