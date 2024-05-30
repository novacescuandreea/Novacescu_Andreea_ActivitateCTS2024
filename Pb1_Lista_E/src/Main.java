public class Main {
    public static void main(String[] args){
        JucatoriFactory jucatoriFactory = new JucatoriFactory();
        IJucatori jucatori =null;
        try{
            jucatori = jucatoriFactory.creareJucatori(ECategorieJucatori.Atacant);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        jucatori.afisareDescriere();
    }
}
