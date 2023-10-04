import java.util.Date;
public class Greet extends Thread {
    String greeting;

    public Greet(String aGREETING) {
        greeting = aGREETING;
    }

    public void run() {
        Date now = new Date();
        for (int i = 0; i < 10; i++) {
            System.out.println(now + " " + greeting);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
