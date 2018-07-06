package iterator;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 21:30
    */

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器
 * @param <T>
 */
public class ConcreteIterator<T> implements Iterator{
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        T obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}