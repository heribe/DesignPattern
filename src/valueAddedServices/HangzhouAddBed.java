package valueAddedServices;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:29
    */

import room.Room;

/**
 * 杭州加床
 */
public class HangzhouAddBed extends valueAddedServicesDecorator {
    Room room;

    public HangzhouAddBed(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", add bed";
    }

    @Override
    public double cost() {
        return 90 + room.cost();
    }
}
