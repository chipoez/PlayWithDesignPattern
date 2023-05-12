public class Main {
    public static void main(String[] args) {
        Boy boy0 = new Boy();
        boy0.setAge("10");
        boy0.setName("zhangsan");
        Boy boy1 = boy0;
        boy0.setAge("11");
        System.out.println("boy1:"+boy1.getAge());
        Boy boy2 = new Boy();
        boy2.age = boy0.age;
        boy0.setAge("12");
        System.out.println("boy2:"+boy2.getAge());
    }
}