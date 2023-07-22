package desafio;
import javax.swing.JOptionPane;

public class JogoComida{

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Pense em um prato que voc� gosta...");

        boolean respostaMassa = perguntaSimOuNao("O prato que voc� pensou � massa?");
        if (respostaMassa) {
            boolean respostaLasanha = perguntaSimOuNao("O prato que voc� pensou � lasanha?");
            if (respostaLasanha) {
                JOptionPane.showMessageDialog(null, "Acertei de novo!");
            } else {
                String pratoPensado = JOptionPane.showInputDialog("Qual prato voc� pensou?");
                if (pratoPensado != null && !pratoPensado.trim().isEmpty()) {
                    boolean respostaPratoPensado = perguntaSimOuNao("O que voc� digitou � " + pratoPensado + "?");
                    if (respostaPratoPensado) {
                        JOptionPane.showMessageDialog(null, "Acertei!");
                    } else {
                        boolean respostaBoloChocolate = perguntaSimOuNao("O prato que voc� pensou � bolo de chocolate?");
                        if (respostaBoloChocolate) {
                            JOptionPane.showMessageDialog(null, "Acertei de novo!");
                        } else {
                            String pratoPensadoNaoBolo = JOptionPane.showInputDialog("Qual prato voc� pensou?");
                            
                            JOptionPane.showMessageDialog(null, "Aprendi! O prato que voc� pensou � " + pratoPensadoNaoBolo);
                        }
                    }
                }
            }
        } else {
            boolean respostaBoloChocolate = perguntaSimOuNao("O prato que voc� pensou � bolo de chocolate?");
            if (respostaBoloChocolate) {
                JOptionPane.showMessageDialog(null, "Acertei!");
            } else {
                String pratoPensadoNaoBolo = JOptionPane.showInputDialog("Qual prato voc� pensou?");
                JOptionPane.showMessageDialog(null, "Aprendi! O prato que voc� pensou � " + pratoPensadoNaoBolo);
            }
        }
    }

    public static boolean perguntaSimOuNao(String pergunta) {
        int resposta = JOptionPane.showConfirmDialog(null, pergunta, "Jogo Gourmet", JOptionPane.YES_NO_OPTION);
        return resposta == JOptionPane.YES_OPTION;
    }
}
