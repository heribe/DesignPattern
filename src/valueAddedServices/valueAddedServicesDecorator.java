package valueAddedServices;/*
    created by IntelliJ IDEA.
    User: Heribe Zhou
    Date: 2018/6/17
    Time: 19:18
    */
import room.*;

/**
 * 增值服务的抽象类
 */
public abstract class valueAddedServicesDecorator extends Room {
    @Override
    public abstract String getDescription();
}
