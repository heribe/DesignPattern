package hotel;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 20:29
    */

import room.BeijingDoubleRoom;
import room.BeijingTwinRoom;
import room.Room;
import valueAddedServices.BeijingAddBed;
import valueAddedServices.BeijingAddBreakfast;

/**
 * 北京酒店实现类
 */
public class BeijingHotel extends Hotel {
    @Override
    protected Room createRoom(String []type) {
        Room room;
        if(type[0]. equals("double room")){
            room = new BeijingDoubleRoom();
        }else if(type[0].equals("twin room")){
            room = new BeijingTwinRoom();
        }else return null;

        if(type.length!=1){
            for (int i = 1; i < type.length; i++) {
                if(type[i].equals("add bed")){
                    room = new BeijingAddBed(room);
                }else if(type[i].equals("add breakfast")){
                    room = new BeijingAddBreakfast(room);
                }
            }
        }
        return room;
    }
}
