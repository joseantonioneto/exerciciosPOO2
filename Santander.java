import java.util.Currency;

public class Santander implements IBank {
    String name;
    String manager;
    String country;
    String address;
    double balance;
    Currency currency;
    public Santander (String name, String manager, String country, String address, double balance, String currencyCode){
        this.name = name;
        this.manager = manager;
        this.country = country;
        this.address = address;
        this.balance = balance;
        this.currency = Currency.getInstance(currencyCode);
    }

    @Override
    public double deposit(double valor) {
        this.balance += valor;
        return balance;
    }

    @Override
    public boolean withdraw(double valor) {
        if(valor>balance){
            System.out.println("Insufficient founds!");
            return false;
        }else{
            balance -= valor;
            System.out.println("Amount successfully withdrawn.");
            return true;
        }
    }
}
