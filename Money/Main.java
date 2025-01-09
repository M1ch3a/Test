public class Main {
    public static void main(String[] args) {
        Portamonete monete = new Portamonete();
        Portafoglio banconote = new Portafoglio();
        
        monete.inserisci(0.5);
        monete.inserisci(1);
        banconote.inserisci(5);
        banconote.inserisci(15);

        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                monete.inserisci(0.5, i);
            } else if(i%3 == 0){
                monete.inserisci(1, i);
            } else{
                monete.inserisci(2, i);
            }
        }

        for(int i = 0; i < 20; i++){
            if(i%2 == 0){
                banconote.inserisci(0.5, i);
            } else if(i%3 == 0){
                banconote.inserisci(1, i);
            } else if(i%5 == 0){
                banconote.inserisci(20, i);
            } else if(i%7 == 0){
                banconote.inserisci(10, i);
            } else if(i%11 == 0){
                banconote.inserisci(5, i);
            } else{
                banconote.inserisci(2, i);
            }
        }

        System.out.println(monete.denaro());
        System.out.println(monete.denaroPerTipo());

        System.out.println(banconote.denaro());
        System.out.println(banconote.denaroPerTipo());
    }
}
