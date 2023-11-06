public class ModelDuck extends Duck {
    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.soundBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato Modelo");
    }


    @Override
    public void setFlyBehavior(IFly flyBehavior) {
        super.setFlyBehavior(flyBehavior);
    }

    @Override
    public String toString() {
        return "ModelDuck{" +
                "flyBehavior=" + flyBehavior +
                ", soundBehavior=" + soundBehavior +
                '}';
    }
}

