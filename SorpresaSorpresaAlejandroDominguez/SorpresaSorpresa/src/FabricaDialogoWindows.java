public class FabricaDialogoWindows implements GUIFactory{
    public Dialogo crearDialogo() {
        return new DialogoWindows();
    }
    public Cliente crearCliente() {
        return new WindowsCheckBox();
    }
}
