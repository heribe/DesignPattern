package room;/*
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:16
    */

/**
 * 房间的抽象类
 */
public abstract class Room {
    /**
     * 房间的描述信息
     */
    String description = "Unknown Room";

    /**
     * 得到房间的描述
     * @return
     */
    public String getDescription(){
        return description;
    }

    /**
     * 计算房间的价格
     * @return
     */
    public abstract double cost();
}
