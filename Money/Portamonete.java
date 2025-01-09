public class Portamonete{

    private double cent;
    private double euro1;
    private double euro2;

    public Portamonete(){
        this.cent = 0;
        this.euro1 = 0;
        this.euro2 = 0;
    }

    public Portamonete(double cent, double euro1, double euro2){
        setCent(cent);
        setEuro1(euro1);
        setEuro2(euro2);
    }

    public double getCent() { return cent; }
    public void setCent(double cent) { this.cent = cent; }

    public double getEuro1() { return euro1; }
    public void setEuro1(double euro1) { this.euro1 = euro1; }

    public double getEuro2() { return euro2; }
    public void setEuro2(double euro2) { this.euro2 = euro2; }

    public String denaro(){
        return "Tu hai " + (getCent()+getEuro1()+getEuro2()) + " euro";
    }

    public String denaroPerTipo(){
        return "Tu hai " + (getCent()/0.5) + " monete da 50 centesimi, hai " + (getEuro1()) + " monete da 1 euro, hai " + (getEuro2()/2) + " monete da 2 euro";
    }

    public void inserisci(double valore){
        if(valore == 0.5){
            setCent(getCent() + valore);
        } else if(valore == 1){
            setEuro1(getEuro1() + valore);
        } else if(valore == 2){
            setEuro2(getEuro2() + valore);
        }
    }

    public void inserisci(double valore, int n){
        if(valore == 0.5){
            setCent(getCent() + (valore * n));
        } else if(valore == 1){
            setEuro1(getEuro1() + (valore * n));
        } else if(valore == 2){
            setEuro2(getEuro2() + (valore * n));
        }
    }
}