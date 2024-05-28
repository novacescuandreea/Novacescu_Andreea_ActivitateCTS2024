public class RestaurantFactory {
    public IRestaurant creareSupe(ETipSupe tipSupe) throws Exception{
        switch(tipSupe){
            case SupaDeCiuperci:
               return new SupaDeCiuperci();
            case SupaDeVita:
                return new SupaDeVita();
            case SupaDeLegume:
                return new SupaDeLegume();
            default:
                throw new Exception("Nu exista alt tip de supa!");
        }
    }
}
