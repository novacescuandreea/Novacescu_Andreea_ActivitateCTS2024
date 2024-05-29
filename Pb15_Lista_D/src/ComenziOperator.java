import java.util.Stack;

public class ComenziOperator {
    private Stack<ICommand> comenziExecutate = new Stack<>();

    public void executaComanda(ICommand command) {
        command.executa();
        comenziExecutate.push(command);
    }

    public void undo() {
        if (!comenziExecutate.isEmpty()) {
            ICommand ultimaComanda = comenziExecutate.pop();
            ultimaComanda.undo();
        } else {
            System.out.println("Nu există comenzi pentru a fi anulate.");
        }
    }
}
