public class Application {
    private Dialogo dialogo;
    private Cliente cliente;

    public Application(GUIFactory factory) {
        dialogo = factory.crearDialogo();
        cliente = factory.crearCliente();
    }

    public void paint() {
        dialogo.speak();
        cliente.speak();
    }
}
