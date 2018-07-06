package room;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:27
    */

/**
 * 杭州大床房
 */
public class HangzhouDoubleRoom extends Room {

    public HangzhouDoubleRoom() {
        description = "Hangzhou, Double Room";
    }

    @Override
    public double cost() {
        return 190;
    }
}
