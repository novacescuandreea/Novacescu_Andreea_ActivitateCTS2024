public class NuAreCard implements IState {
    @Override
    public void doAction(Bancomat bancomat) {
        System.out.println("Bancomatul " + bancomat.getNumar() + " are starea NuAreCard");
        bancomat.setStare(new AreCard());
    }
}