//package Session10.demo_tonghop;
//
//public class CreditCard extends PaymentMethod {
//    private String cardNumber; //(Số thẻ tín dụng - yêu cầu kiểm tra $16$ chữ số).
//    private String cvv; // (Mã bảo mật).
//    private double creditLimit; // (Hạn mức tín dụng).
//
//    public CreditCard(String accountName, String paymentId) {
//        super(accountName, paymentId);
//    }
//
//    public CreditCard() {
//    }
//
//    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public String getCvv() {
//        return cvv;
//    }
//
//    public double getCreditLimit() {
//        return creditLimit;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public void setCvv(String cvv) {
//        this.cvv = cvv;
//    }
//
//    public void setCreditLimit(double creditLimit) {
//        this.creditLimit = creditLimit;
//    }
//    @Override
//    public void pay(double amount) {
//        creditLimit = creditLimit - amount;
//    }
//
//    @Override
//    public void validate() {
//        if (cardNumber != null && cardNumber.matches("\\d{16}")) {
//            System.out.println("The tin dung khong hop le ");
//
//        } else {
//            System.out.println("The tin dung hop le ");
//        }
//    }
//}
