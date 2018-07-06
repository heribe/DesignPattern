package room;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:27
    */

/**
 * 北京大床房
 */
public class BeijingDoubleRoom extends Room {

    public BeijingDoubleRoom() {
        description = "Beijing, Double Room";
    }

    @Override
    public double cost() {
        return 200;
    }
}
