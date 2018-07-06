package hotel;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 20:04
    */

import room.Room;

/**
 * 酒店的抽象类
 */
public abstract class Hotel {

    /**
     * 定房间
     * @param type
     * @return
     */
    public Room orderRoom(String []type){
        Room room;
        room = createRoom(type);
        return room;
    }

    /**
     * 创建房间
     * @param type
     * @return
     */
    protected abstract Room createRoom(String []type);
}
