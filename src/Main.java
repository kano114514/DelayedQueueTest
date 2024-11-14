import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DelayQueue<Order> delayQueue = new DelayQueue<>();
        Order order1=new Order(5,"life goes on", TimeUnit.SECONDS);
        Order order2=new Order(10,"Yanami!", TimeUnit.SECONDS);
        Order order3=new Order(15,"Nukumizu?", TimeUnit.SECONDS);
        delayQueue.add(order1);
        delayQueue.add(order2);
        delayQueue.add(order3);

        while(!delayQueue.isEmpty()){
            Order order = delayQueue.poll();
            if(order!=null){
                System.out.println(order.name+"in "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }
    }
}
