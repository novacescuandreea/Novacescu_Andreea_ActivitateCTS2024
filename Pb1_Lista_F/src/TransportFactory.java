public class TransportFactory {
    public ITransport creareMijlocTransport(EMijlocTransport tipTransport) throws Exception{
        switch(tipTransport){
            case Autobuz:
                return new TransportAutobuz();
            case Tramvai:
                return new TransportTramvai();
            case Troileibuz:
                return new TransportTroleibuz();
            default:
                throw new Exception("Nu exista alt tip de jucator!");
        }
    }
}
