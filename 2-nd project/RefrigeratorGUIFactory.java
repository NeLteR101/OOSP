public class RefrigeratorGUIFactory implements GUIFactory{
    @Override
    public ContolPanel createControlPanel() {
        return new RefrigeratorControlPanel();
    }

    @Override
    public OnSwitchButton createOnSwitchButton() {
        return new RefrigeratorOnSwitchButton();
    }
}
