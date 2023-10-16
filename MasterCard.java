import java.util.Random;

public class MasterCard extends CreditCard{
    public MasterCard(String ownerName, IBank bank, double monthlyIncome) {
        super(ownerName, bank, monthlyIncome);
    }
    @Override
    public String generateCreditCardNumber(){
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder("5");
        for(int i =1; i<16; i++){
            int digit = random.nextInt(10);
            cardNumber.append(digit);
        }
        return cardNumber.toString();
    }
    @Override
    public double grantCreditLimit(double monthlyIncome){
        return monthlyIncome * 2.5;
    }
}

