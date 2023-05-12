public class AccessUser implements IUser{

    public void insert(User user){
        System.out.println("在Access中给User表增加一条记录");
    }
    public User getUser(int id){
        System.out.println("在Access中根据用户ID得到User表的一条记录");
        return null;
    }
}
