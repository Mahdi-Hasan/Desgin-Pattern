public class DimUpCommand implements ICommand{
    Light light;
    public DimUpCommand(Light l){
        this.light=l;
    }
    @Override
    public void execute() {
        this.light.dimUp();
    }

    @Override
    public void unexecute() {
        this.light.dimDown();
    }
}
