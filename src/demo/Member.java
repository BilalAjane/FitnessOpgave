package demo;

import org.w3c.dom.ls.LSOutput;

public class Member extends Person{

    private Boolean isBasic;

    public Member(String name, String cpr, Boolean isBasic) {
        super(name,cpr);
        this.isBasic = isBasic;
    }

    public Boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic){
        isBasic = basic;
    }


    public int monthlyFee(){
        if (isBasic){
           return 199;
        } else {
           return 299;
        }
    }

    public String memberType(){
        if(isBasic){
            return "Basic";
        } else {
            return "Full";
        }
    }

    @Override
    public String toString() {
        return " Name: " + name + " CPR: " + cpr + " Member Type: " + memberType() + " Monthly Fee: " + monthlyFee();

    }
}
