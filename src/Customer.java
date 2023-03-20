import jdk.internal.icu.lang.UCharacterDirection;

public class Customer extends discountRate {
    private String name;
    private boolean isMember ;
    private MemberType memberType;



    public Customer(String name, boolean isMember, MemberType memberType){
        this.name = name;
        this.isMember = isMember;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isMember() {
        return isMember;
    }
    public void setMember(boolean member) {
        isMember = member;
    }
    public MemberType getMemberType() {
        return memberType;
    }
    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", isMember=" + isMember +
                ", memberType='" + memberType + '\'' +
                '}';
    }

    public double getServiceDiscountPremium(){
        return 0;
    }

    public double getServiceDiscountGold(){
        return 0;
    }

    public double getServiceDiscountSilver(){
        return 0;
    }

    public double getProductDiscountPremium(){
        return 0;
    }

    public double getProductDiscountGold(){
        return 0;
    }

    public double getProductDiscountSilver(){
        return 0;
    }

    public static double getServiceDiscountRate(String type, UCharacterDirection memberType){
        return 0;
    }

    public double getProductDiscountRate(String type){
        return 0;
    }
}
