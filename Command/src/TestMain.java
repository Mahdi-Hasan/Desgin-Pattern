public class TestMain {
    public static void main(String[] args) {
        Light light=new Light();
        Invoker invoker=new Invoker(new LightOnCommand(light),new LightOffCommand(light),
                        new DimUpCommand(light),new DimDownCommand(light));
        invoker.lightOnClicked();
        invoker.lightOffClicked();
        invoker.dimUpClicked();
        invoker.dimDownClicked();
    }

}
