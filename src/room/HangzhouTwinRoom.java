package room;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:28
    */
/**
 * 杭州双人间
 */
public class HangzhouTwinRoom extends Room {
    public HangzhouTwinRoom() {
        description = "Hangzhou, Twin Room";
    }

    @Override
    public double cost() {
        return 170;
    }
}
