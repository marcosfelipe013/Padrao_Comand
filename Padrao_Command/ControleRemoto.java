import java.util.Stack;

public class ControleRemoto {
    private Comando comando;
    private Stack<Comando> historicoComandos = new Stack<>();

    public void definirComando(Comando comando) {
        this.comando = comando;
    }

    public void pressionarBotao() {
        if (comando != null) {
            System.out.println("Pressionando botão...");
            comando.executar();
            historicoComandos.push(comando);
        } else {
            System.out.println("Nenhum comando configurado.");
        }
    }

    public void pressionarDesfazer() {
        if (!historicoComandos.isEmpty()) {
            Comando ultimoComando = historicoComandos.pop();
            System.out.println("Desfazendo: " + ultimoComando.getClass().getSimpleName() + "...");
            ultimoComando.desfazer();
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }
}