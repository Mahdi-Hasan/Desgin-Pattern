public class Invoker {
    ICommand LightOn;
    ICommand LightOff;
    ICommand DimUp;
    ICommand DimDown;

    public Invoker( ICommand LightOn,ICommand LightOff,ICommand DimUp,ICommand DimDown){
        this.LightOn=LightOn;
        this.LightOff=LightOff;
        this.DimUp=DimUp;
        this.DimDown=DimDown;
    }
    public void lightOnClicked(){
        this.LightOn.execute();
    }
    public void lightOffClicked(){
        this.LightOff.execute();
    }
    public void dimUpClicked(){
        this.DimUp.execute();
    }
    public void dimDownClicked(){
        this.DimDown.execute();
    }


}
