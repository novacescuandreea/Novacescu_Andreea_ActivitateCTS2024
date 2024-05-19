public class MedicamenteFactory {
    public IMedicamente creareMedicamente(EMedicamenteFarmacie tipMedicamente) throws Exception{
        switch(tipMedicamente){
            case Body:
                return new MedicamenteBody();
            case Raceala:
                return new MedicamenteRaceala();
            case Durere:
                return new MedicamenteDurere();
            default:
                throw new Exception("Nu este alta categorie de medicamente!");
        }
    }
}
