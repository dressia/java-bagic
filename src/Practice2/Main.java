package Practice2;

public class Main {
    public static void main(String args[]){
        UserSetting userSetting1 = new UserSetting(0,new Working());
        userSetting1.alertSet();
        userSetting1.statusSet();

        System.out.println("-----------------------------");

        UserSetting userSetting2 = new UserSetting(0,new Breaking());
        userSetting2.alertSet();
        userSetting2.statusSet();

        System.out.println("-----------------------------");

        UserSetting userSetting3 = new UserSetting(1,new Absence());
        userSetting3.alertSet();
        userSetting3.statusSet();
    }
}
