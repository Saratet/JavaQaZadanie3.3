public class CreditPaymentService {
    public int calculate(int amountOfCredit, double loanRate, int creditTerm){
        double coefficient = ((loanRate / 12) * Math.pow(1 + (loanRate / 12), creditTerm * 12)) / ( Math.pow(1 + (loanRate / 12), creditTerm * 12) - 1);
        double exactMonthlyPayment = amountOfCredit * coefficient;
        int monthlyPayment = (int) exactMonthlyPayment;
        return monthlyPayment;
    }
}