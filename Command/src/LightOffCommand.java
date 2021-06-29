public class LightOffCommand implements ICommand{
    Light light;
    public LightOffCommand(Light l){
        this.light=l;
    }
    @Override
    public void execute() {
    this.light.off();
    }

    @Override
    public void unexecute() {
    this.light.on();
    }
}
