public class Plane extends Vehicle{
    double speed = 80;

    public Plane(double distance) {
        super(distance);
    }

    @Override
    public double time() {
        return distance/speed;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "speed=" + speed +
                ", distance=" + distance + ", time= "+time()+
                '}';
    }
}
