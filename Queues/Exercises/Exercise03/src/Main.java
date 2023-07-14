import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(3);//trapeza me 3 tameia
        Random r = new Random();

        for(int i = 0; i < 100; i++){
            if(r.nextInt(100)<70){//piuanothta na ftasei ena pelaths kata 70% dhladh  mas epistrefei ena tyxaio ariumo mikrotero apo to 70 tote auto symbainei
                                        // stis 70 periptwshs apo ths 100
                bank.customerEnters("customer: "+ i,1 + r.nextInt(5));//pelathhs pou eiserxete sthn trapeza opou tou anatiuete tyxaia proteraiothta eksipirethshs
            }else{
                bank.customerServed();//kai 30% na eksipiretiuei enas pelaths dhladh epistrefei ena tyxaio pelath pou eksipirethtai kai auto symbainei stis 30 periptwshs apo tis 100
            }

            if(i % 10 == 0)//ana 10 pelates pou eksipiretei epistrefei thn katastash enos tameiou(dhladh ana 10 bhmata pou kanei to for loop)
                System.out.println(bank);

        }

    }
}
