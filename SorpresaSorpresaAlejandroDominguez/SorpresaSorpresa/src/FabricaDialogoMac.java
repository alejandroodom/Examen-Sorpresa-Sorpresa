public class FabricaDialogoMac implements GUIFactory{
    public Dialogo crearDialogo() {
        return new DialogoMac();
    }
    public Cliente crearCliente() {
        return new MacCheckBox();
    }

}
