public class DimDownCommand implements ICommand{
    Light light;
    public DimDownCommand(Light l){
        this.light=l;
    }

    @Override
    public void execute() {
        this.light.dimDown();
    }

    @Override
    public void unexecute() {
        this.light.dimUp();
    }
}
