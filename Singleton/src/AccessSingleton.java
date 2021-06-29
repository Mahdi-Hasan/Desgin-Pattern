public class AccessSingleton {
    public static void main(String[] args) {
        Singleton s1= Singleton.getInstance(10);
        Singleton s2= Singleton.getInstance(20);
        System.out.println(s1.getNumber());
        System.out.println(s2.getNumber());

    }
}
