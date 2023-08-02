public abstract class Vehicle {
    public double distance;
    public abstract double time();

    public Vehicle(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "distance=" + distance +
                '}';
    }
}
