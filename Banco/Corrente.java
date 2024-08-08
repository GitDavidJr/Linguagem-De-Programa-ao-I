public class Corrente extends Conta {

    private Double value;
    private Double limite;
    private Double valorG;
    private double juros;

    public Corrente(int number, Double balance, Cliente holder){
        super(number, balance, holder);
        value = 0.0;
        limite = 500.0;
        valorG = 0.0;
        juros = 0.1;
    }

    public void setTaxa(Double v){
        value = v;
    }

    public void setLimite(Double v){
        limite = v;
    }

    public void debitC(Double v){
        if((v <= (limite - valorG)) && (balance >= 0)){
            valorG += v;
        } else {
            System.out.println("Transação não autorizada");
        }
    }

    public void viradaM(){ 
        if(valorG >= 80){
        balance -= value;
        }

        if(balance < 0){
            balance -= ((Math.abs(balance)  + (balance * juros)));
        }

        balance -= valorG;
    }

    public void extract(){
        super.extract();
        System.out.println("Tipo da conta: Corrente");
        System.out.println("Taxa: " + value + "/mes");
    }
}