public class Animal implements Runnable{
    String name;
    String cry;
    int cycle;

    public Animal(String name, String cry, int cycle) {
        this.name = name;
        this.cry = cry;
        this.cycle = cycle;
    }

    @Override
    public void run() {
        int time = this.cycle*1000;
        while(true){
            try {
                System.out.println(this.cry);
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
