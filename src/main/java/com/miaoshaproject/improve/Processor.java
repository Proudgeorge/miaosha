package com.miaoshaproject.improve;
import org.apache.http.HttpRequest;
/**
 * @author simba@onlying.cn
 * @date 2019/9/3 10:24
 */
public class Processor {
    /**
     * 发送秒杀事务到数据库队列.
     */
    public static void kill(BidInfo info) {
        DB.bids.add(info);
    }
    public static void process() {
        BidInfo info = new BidInfo(RequestQueue.queue.poll());
        if (info != null) {
            kill(info);
        }
    }
}
class BidInfo {
    BidInfo(HttpRequest request) {
        // Do something.
    }
}
