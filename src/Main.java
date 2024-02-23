public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amountOfCredit = 1_000_000;
        double loanRate = 9.99;
        int creditTerm1 = 1;
        int creditTerm2 = 2;
        int creditTerm3 = 3;

        int loanForAYear1 = service.calculate(amountOfCredit, loanRate / 100, creditTerm1);
        int loanForAYear2 = service.calculate(amountOfCredit, loanRate / 100, creditTerm2);
        int loanForAYear3 = service.calculate(amountOfCredit, loanRate / 100, creditTerm3);

        System.out.println("Ежемесячный платеж при кредите на 1 год: " + loanForAYear1);
        System.out.println("Ежемесячный платеж при кредите на 2 года: " + loanForAYear2);
        System.out.println("Ежемесячный платеж при кредите на 3 года: " + loanForAYear3);
    }
}