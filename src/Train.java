public class Train extends Vehicle{
    double speed = 40;

    public Train(double distance) {
        super(distance);
    }


    @Override
    public double time() {

        return distance/speed;
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed=" + speed +", distance= "+distance+", time= "+time()+
                '}';
    }
}
