public class AreCard implements IState {
    @Override
    public void doAction(Bancomat bancomat) {
        System.out.println("Bancomatul " + bancomat.getNumar() + " are starea AreCard");
        bancomat.setStare(new ArePinIntrodus());
    }
}
