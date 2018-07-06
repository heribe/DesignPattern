package valueAddedServices;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:29
    */

import room.Room;

/**
 * 杭州加早餐
 */
public class HangzhouAddBreakfast extends valueAddedServicesDecorator {
    Room room;

    public HangzhouAddBreakfast(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", add Breakfast";
    }

    @Override
    public double cost() {
        return 15 + room.cost();
    }
}
