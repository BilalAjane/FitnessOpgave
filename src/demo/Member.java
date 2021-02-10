package demo;

public class Member extends Person{

    private Boolean isBasic;

    public Member() {
    }

    public Member(String name, String cpr, Boolean isBasic) {
        this.name = name;
        this.cpr = cpr;
        this.isBasic = isBasic;
    }


    public Boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic){
        isBasic = basic;
    }

    public Boolean getBasic() {
        return isBasic;
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
        return " Name: " + name + ", CPR: " + cpr + ", Member Type: " + memberType() + ", Monthly Fee: " + monthlyFee();

    }
}
