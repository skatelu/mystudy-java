package proxystudy;

public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("Add 方法执行了");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("Update 方法执行了");
        return id;
    }

}
