public class ArePinIntrodus implements IState {
    @Override
    public void doAction(Bancomat bancomat) {
        System.out.println("Bancomatul " + bancomat.getNumar() + " are starea ArePinIntrodus");
        bancomat.setStare(new NuAreBani());
    }
}