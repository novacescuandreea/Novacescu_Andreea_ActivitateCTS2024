public class Main {
    public static void main(String[] args){
        TransportFactory transportFactory = new TransportFactory();
        ITransport transporturi =null;
        try{
            transporturi = transportFactory.creareMijlocTransport(EMijlocTransport.Autobuz);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        transporturi.afisareDescriere();
    }
}
