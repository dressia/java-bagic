package Practice2;

public class UserSetting {
    int alert;
    Status status;

    UserSetting(int alert, Status status){
        this.alert=alert;
        this.status=status;
    }

    protected void alertSet(){
        if(alert==0){
            System.out.println("通知をOFFにしています。");
        }
        if(alert==1) {
            System.out.println("通知をONにしています。");
        }
    }

    protected void statusSet(){
        status.statusSet();
    }

}
