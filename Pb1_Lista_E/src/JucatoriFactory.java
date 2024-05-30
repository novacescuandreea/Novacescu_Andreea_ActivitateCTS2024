public class JucatoriFactory {
    public IJucatori creareJucatori(ECategorieJucatori tipJucatori) throws Exception{
        switch(tipJucatori){
            case Atacant:
                return new JucatoriAtacant();
            case Fundas:
                return new JucatoriFundas();
            case Portar:
                return new JucatoriPortar();
            default:
                throw new Exception("Nu exista alt tip de jucator!");
        }
    }
}
