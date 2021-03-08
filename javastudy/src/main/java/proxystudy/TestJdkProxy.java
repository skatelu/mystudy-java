package proxystudy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 学习JDK 的动态代理
 * 1、创建接口，定义方法 UserDao
 * 2、创建接口实现类 UserDaoImpl
 * 3、使用Proxy类创建
 * 
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};

        UserDaoImpl userDao = new UserDaoImpl();

        UserDao dao = (UserDao) Proxy.newProxyInstance(TestJdkProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        dao.add(2, 3);

        dao.update("1234");
    }

}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前处理
        System.out.println("方法之前执行" + method.getName());

        Object res = method.invoke(obj, args);

        // 方法之后进行处理
        System.out.println("方法之后执行。。。。" + obj);

        return res;
    }
}
