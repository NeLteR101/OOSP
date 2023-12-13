public class WashingMachineGUIFactory implements GUIFactory{
    @Override
    public ContolPanel createControlPanel() {
        return new WashingMachineControlPanel();
    }

    @Override
    public OnSwitchButton createOnSwitchButton() {
        return new WashingMachineOnSwitchButton();
    }
}
