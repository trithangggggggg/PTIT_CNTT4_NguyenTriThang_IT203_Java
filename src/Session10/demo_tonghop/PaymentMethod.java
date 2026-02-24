package Session10.demo_tonghop;

public abstract class PaymentMethod {
    protected String accountName;
    protected String paymentId;

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public PaymentMethod() {
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public abstract void validate();
}
