public class App {
    public static void main(String[] args) {
        InterfaceGrafica ig = new InterfaceGrafica();
        Janela principal = new Janela("Janela Principal", 1280, 1024);
        Janela config = new Janela("Configurações", 600, 300);

        JanelaFixa menu = new JanelaFixa("Menu", 80, 280, "INFERIOR");
        JanelaFixa status = new JanelaFixa("Status", 1280, 30, "SUPERIOR");

        ig.adicionar(principal);
        ig.adicionar(config);
        ig.adicionar(menu);
        ig.adicionar(status);

        ig.desenhar();
    }
}
