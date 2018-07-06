package iterator;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 21:32
    */

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器接口
 * @param <T>
 */
public class ConcreteAggregate<T> implements Aggregate<T>{
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}