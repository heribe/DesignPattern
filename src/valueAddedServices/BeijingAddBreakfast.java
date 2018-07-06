package valueAddedServices;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:29
    */

import room.Room;

/**
 * 北京加早餐
 */
public class BeijingAddBreakfast extends valueAddedServicesDecorator {
    Room room;

    public BeijingAddBreakfast(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", add Breakfast";
    }

    @Override
    public double cost() {
        return 20 + room.cost();
    }
}
