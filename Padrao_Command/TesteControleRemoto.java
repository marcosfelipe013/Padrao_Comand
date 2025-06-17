
public class TesteControleRemoto {
    public static void main(String[] args) {
        
        Lampada minhaLampada = new Lampada();

        
        LigarLampadaComando ligar = new LigarLampadaComando(minhaLampada);
        DesligarLampadaComando desligar = new DesligarLampadaComando(minhaLampada);

        // 3. Cria o Invocador
        ControleRemoto controle = new ControleRemoto();

        System.out.println("--- Cenário 1: Ligando e Desligando a Lâmpada ---");
       
        controle.definirComando(ligar);
        controle.pressionarBotao(); 

       
        controle.pressionarDesfazer(); 

        
        controle.definirComando(desligar);
        controle.pressionarBotao(); 

        
        controle.pressionarDesfazer(); 

        System.out.println("\n--- Cenário 2: Sem comando configurado ---");
        ControleRemoto controleVazio = new ControleRemoto();
        controleVazio.pressionarBotao(); 
        controleVazio.pressionarDesfazer(); 
    }
}