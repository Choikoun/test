/**
 * Created by root on 16. 6. 10.
 */
public class makeThread implements Runnable {
    static int threadConter = 0;
    int thisNumber;

    public makeThread() {
        threadConter++;
        thisNumber = threadConter;
        this.run();
    }
    @Override
    public void run() {
        System.out.println(this.thisNumber);
    }
}
