//factory method
public class Main {
    public static void main(String[] args){
        RestaurantFactory spitalFactory = new RestaurantFactory();
        IRestaurant spital =null;
        try{
            spital = spitalFactory.creareSupe(ETipSupe.SupaDeVita);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        spital.afisareDescriere();
    }
}
