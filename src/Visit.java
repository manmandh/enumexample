import jdk.internal.icu.lang.UCharacterDirection;
import java.util.Date;

public class Visit extends Customer {
     private Customer customer;
     private Date date;
     private double serviceExpense;
     private double productExpense;


    public Visit(String name, boolean isMember, MemberType memberType, Customer customer, Date date, double serviceExpense, double productExpense) {
        super(name, isMember, memberType);
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
        this.customer.setName(name);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }

    public  double getTotalExpense(Object memberType) {
        if (customer.getMemberType().equals("GOLD")) {
            return discountRate.getServiceDiscountRate(MemberType.GOLD.toString(), (UCharacterDirection) memberType) + discountRate.getServiceDiscountRate();
        } else {
            return 0;

        }
    }
}
