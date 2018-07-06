import hotel.BeijingHotel;
import hotel.HangzhouHotel;
import hotel.Hotel;
import iterator.Aggregate;
import iterator.ConcreteAggregate;
import iterator.Iterator;
import room.Room;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入：地点(Beijing或Hangzhou),房间类型(doube room或twin room),增值服务(add bed或add breakfast)(可以输入多个增值服务，以英文逗号隔开)
 * 输出：房间描述 ||￥价格
 */
public class Main {

    public static void main(String[] args) {
        Aggregate<Room> rooms = new ConcreteAggregate<>();
        while (true) {
            System.out.println("please enter your order:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] str = s.split(",");
            Hotel hotel = null;
            if (str[0].equals("Beijing")) {
                hotel = new BeijingHotel();
            }else if (str[0].equals("Hangzhou")){
                hotel = new HangzhouHotel();
            }else if (str[0].equals("show all")){
                //迭代器模式
                Iterator<Room> i = rooms.iterator();
                while(i.hasNext()){
                    Room iroom = i.next();
                    System.out.println(iroom.getDescription() + " ||￥" + iroom.cost());
                }
                continue;
            }else {
                System.out.println("false");
                continue;
            }
            String[] strArray = Arrays.copyOfRange(str, 1, str.length);
            Room room = hotel.orderRoom(strArray);
            rooms.add(room);
            System.out.println(room.getDescription() + " ||￥" + room.cost());

        }

    }
}
