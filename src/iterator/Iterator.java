package iterator;
/* 
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 21:29
    */

/**
 * 迭代器接口
 * @param <T>
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return  true 表示有，false 表示没有
     * */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     * */
    T next();


}