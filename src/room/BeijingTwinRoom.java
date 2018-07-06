package room;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:28
    */
/**
 * 北京双人间
 */
public class BeijingTwinRoom extends Room {
    public BeijingTwinRoom() {
        description = "Beijing, Twin Room";
    }

    @Override
    public double cost() {
        return 180;
    }
}
