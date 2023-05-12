public class Main {
    public static void main(String[] args) {
        IFactory factory = new SqlserverFactory();
        IUser iu = DataAccess.createUser();
        iu.insert(new User());
        iu.getUser(1);
        IDepartment idept = DataAccess.createDepartment();
        idept.insert(new Department());
        idept.getDepartment(1);
    }

}