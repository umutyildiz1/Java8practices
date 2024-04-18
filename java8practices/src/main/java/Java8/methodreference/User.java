package Java8.methodreference;

public class User {
    private Boolean isReal;
    private Boolean isTall;

    public User(Boolean isReal, Boolean isTall) {
        this.isReal = isReal;
        this.isTall = isTall;
    }

    public static Boolean isReal(User u){
        return u.isReal;
    }

    public Boolean isTall(){
        return isTall;
    }

}
