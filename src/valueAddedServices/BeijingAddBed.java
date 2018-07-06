package valueAddedServices;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:29
    */

import room.Room;

/**
 * 北京加床
 */
public class BeijingAddBed extends valueAddedServicesDecorator {
    Room room;

    public BeijingAddBed(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", add bed";
    }

    @Override
    public double cost() {
        return 100 + room.cost();
    }
}
