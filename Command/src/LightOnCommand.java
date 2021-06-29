public class LightOnCommand implements ICommand{
    Light light;
    public LightOnCommand(Light l){
        this.light=l;
    }
    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unexecute() {
        this.light.off();
    }
}
