public class Ground {

    public static void main(String[] args) {
        Runnable duck = new Animal("duck","꿱꿱",3);
        Runnable pig = new Animal("pig", "꿀꿀",5);
        Runnable lion = new Animal("lion","우오아아",2);
        Thread t1 = new Thread(duck);
        Thread t2 = new Thread(pig);
        Thread t3 = new Thread(lion);
        t1.start();
        t2.start();
        t3.start();
    }
}
