package AtividadeRelogio;

public class RelogioLP1{
    private int hr;
    private int min;
    private int sec;

    public RelogioLP1(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;      
    }

    public void setHora(int setHr, int setMin, int setSec){
        
        if(setHr+((setMin + (setSec/60))/60)<= 23){
            hr = setHr+((setMin + (setSec/60))/60);
        }
        else{
            hr = (setHr + ((setMin + (setSec / 60)) / 60))%24;
        }
        
        if(setMin + (setSec / 60) <= 59){
            min = setMin + (setSec / 60);
        }
        else{
            min = (setMin + (setSec / 60)) % 60;
        } 
        
        if(setSec <= 59){
            sec = setSec;
        }
        else{
            sec = setSec % 60;
        }
    }

    public void getHora(){
            System.out.println("-----------------------");
            System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
            System.out.println("-----------------------");
        }
}
