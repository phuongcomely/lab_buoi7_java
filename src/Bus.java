public class Bus extends Vehicle {
    double speed = 20;

    public Bus(double distance) {
        super(distance);
    }

    @Override
    public double time() {
        return distance/speed;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "speed=" + speed + ", distance= "+distance+", time= "+time()+
                '}';
    }
}
