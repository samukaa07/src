package desafio;
import javax.swing.JOptionPane;

public class JogoComida{

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Pense em um prato que você gosta...");

        boolean respostaMassa = perguntaSimOuNao("O prato que você pensou é massa?");
        if (respostaMassa) {
            boolean respostaLasanha = perguntaSimOuNao("O prato que você pensou é lasanha?");
            if (respostaLasanha) {
                JOptionPane.showMessageDialog(null, "Acertei de novo!");
            } else {
                String pratoPensado = JOptionPane.showInputDialog("Qual prato você pensou?");
                if (pratoPensado != null && !pratoPensado.trim().isEmpty()) {
                    boolean respostaPratoPensado = perguntaSimOuNao("O que você digitou é " + pratoPensado + "?");
                    if (respostaPratoPensado) {
                        JOptionPane.showMessageDialog(null, "Acertei!");
                    } else {
                        boolean respostaBoloChocolate = perguntaSimOuNao("O prato que você pensou é bolo de chocolate?");
                        if (respostaBoloChocolate) {
                            JOptionPane.showMessageDialog(null, "Acertei de novo!");
                        } else {
                            String pratoPensadoNaoBolo = JOptionPane.showInputDialog("Qual prato você pensou?");
                            
                            JOptionPane.showMessageDialog(null, "Aprendi! O prato que você pensou é " + pratoPensadoNaoBolo);
                        }
                    }
                }
            }
        } else {
            boolean respostaBoloChocolate = perguntaSimOuNao("O prato que você pensou é bolo de chocolate?");
            if (respostaBoloChocolate) {
                JOptionPane.showMessageDialog(null, "Acertei!");
            } else {
                String pratoPensadoNaoBolo = JOptionPane.showInputDialog("Qual prato você pensou?");
                JOptionPane.showMessageDialog(null, "Aprendi! O prato que você pensou é " + pratoPensadoNaoBolo);
            }
        }
    }

    public static boolean perguntaSimOuNao(String pergunta) {
        int resposta = JOptionPane.showConfirmDialog(null, pergunta, "Jogo Gourmet", JOptionPane.YES_NO_OPTION);
        return resposta == JOptionPane.YES_OPTION;
    }
}
