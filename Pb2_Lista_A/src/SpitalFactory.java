public class SpitalFactory {
    public ISpital creareSpital(EPersonalSpital tipPersonal) throws Exception{
        switch(tipPersonal){
            case Brancardier:
                return new SpitalBrancardier();
            case Asistent:
                return new SpitalAsistent();
            case Medic:
                return new SpitalMedic();
            default:
                throw new Exception("Nu este personal medical!");
        }
    }
}
