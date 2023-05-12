import java.lang.reflect.InvocationTargetException;

public class DataAccess {
    private static String db = "Sqlserver";

    public  static IUser createUser(){
//        IUser result = switch (db) {
//            case "Sqlserver" -> new SqlserverUser();
//            case "Access" -> new AccessUser();
//            default -> null;
//        };
//        return result;
        return (IUser) getInstance(db+"User");
    }
    public static IDepartment createDepartment(){
//        IDepartment result = switch (db) {
//            case "Sqlserver" -> new SqlserverDepartment();
//            case "Access" -> new AccessDepartment();
//            default -> null;
//        };
//        return result;
        return (IDepartment) getInstance(db+"Department");
    }
    private static Object getInstance(String className){
        Object result = null;
        try {
            result = Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
