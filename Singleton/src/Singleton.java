public class Singleton {
    private static int Number;
    private static Singleton instance;
    private Singleton(int Number){
      this.Number= Number;
    }



    public static Singleton getInstance(int Number){
       if(instance==null){
           instance=new Singleton(Number);
       }

       return instance;
    }

    public static int getNumber() {
        return Number;
    }
}
