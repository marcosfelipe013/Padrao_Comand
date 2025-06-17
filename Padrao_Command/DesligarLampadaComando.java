public class DesligarLampadaComando implements Comando {
    private Lampada lampada;

    public DesligarLampadaComando(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        lampada.desligar();
    }

    @Override
    public void desfazer() {
        lampada.ligar();
    }
}