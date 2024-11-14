import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Order implements Delayed {
    private long time;
    String name;

    public Order(long time, String name,TimeUnit unit) {
        this.name = name;
        this.time=(time>0?unit.toMillis(time):0)+System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return time-System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        Order o1=(Order)o;
        return time-o1.time<=0?-1:1;
    }
}
