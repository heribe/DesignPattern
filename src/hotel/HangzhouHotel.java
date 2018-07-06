package hotel;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 20:29
    */

import room.*;
import valueAddedServices.BeijingAddBed;
import valueAddedServices.BeijingAddBreakfast;
import valueAddedServices.HangzhouAddBed;
import valueAddedServices.HangzhouAddBreakfast;

/**
 * 杭州酒店实现类
 */
public class HangzhouHotel extends Hotel {
    @Override
    protected Room createRoom(String []type) {
        Room room;
        if(type[0]. equals("double room")){
            room = new HangzhouDoubleRoom();
        }else if(type[0].equals("twin room")){
            room = new HangzhouTwinRoom();
        }else return null;

        if(type.length!=1){
            for (int i = 1; i < type.length; i++) {
                if(type[i].equals("add bed")){
                    room = new HangzhouAddBed(room);
                }else if(type[i].equals("add breakfast")){
                    room = new HangzhouAddBreakfast(room);
                }
            }
        }
        return room;
    }
}
