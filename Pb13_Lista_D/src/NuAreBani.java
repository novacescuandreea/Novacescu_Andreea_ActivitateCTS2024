public class NuAreBani implements IState {
    @Override
    public void doAction(Bancomat bancomat) {
            System.out.println("Bancomatul " + bancomat.getNumar() + " are starea NuAreBani");
        }
}