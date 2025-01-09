public class Portafoglio extends Portamonete{
    
    private double banconota5;
    private double banconota10;
    private double banconota20;

    public Portafoglio(){
        super(0, 0, 0);
        this.banconota5 = 0;
        this.banconota10 = 0;
        this.banconota20 = 0;
    }

    public Portafoglio(double cent, double euro1, double euro2, double banconota5, double banconota10, double banconota20){
        super(cent, euro1, euro2);
        setBanconota5(banconota5);
        setBanconota10(banconota10);
        setBanconota20(banconota20);
    }

    public double getBanconota5() { return banconota5; }
    public void setBanconota5(double banconota5) { this.banconota5 = banconota5; }

    public double getBanconota10() { return banconota10; }
    public void setBanconota10(double banconota10) { this.banconota10 = banconota10; }

    public double getBanconota20() { return banconota20; }
    public void setBanconota20(double banconota20) { this.banconota20 = banconota20; }

    @Override
    public String denaro(){
        return "Tu hai " + (getCent()+getEuro1()+getEuro2()+getBanconota5()+getBanconota10()+getBanconota20()) + " euro";
    }

    @Override
    public String denaroPerTipo(){
        return super.denaroPerTipo() + ", hai " + (getBanconota5()/5) + " banconote da 5 euro, hai " + (getBanconota10()/10) + " banconote da 10 euro, hai " + (getBanconota20()/20) + " banconote da 20 euro";
    }

    @Override
    public void inserisci(double valore){
        if(valore == 0.5){
            setCent(getCent() + valore);
        } else if(valore == 1){
            setEuro1(getEuro1() + valore);
        } else if(valore == 2){
            setEuro2(getEuro2() + valore);
        } else if(valore == 5){
            setBanconota5(getBanconota5() + valore);
        } else if(valore == 10){
            setBanconota10(getBanconota10() + valore);
        } else if(valore == 20){
            setBanconota20(getBanconota20() + valore);
        }
    }

    @Override
    public void inserisci(double valore, int n){
        if(valore == 0.5){
            setCent(getCent() + (valore * n));
        } else if(valore == 1){
            setEuro1(getEuro1() + (valore * n));
        } else if(valore == 2){
            setEuro2(getEuro2() + (valore * n));
        } else if(valore == 5){
            setBanconota5(getBanconota5() + (valore * n));
        } else if(valore == 10){
            setBanconota10(getBanconota10() + (valore * n));
        } else if(valore == 20){
            setBanconota20(getBanconota20() + (valore * n));
        }
    }

}
