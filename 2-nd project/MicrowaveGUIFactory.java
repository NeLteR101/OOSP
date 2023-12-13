public class MicrowaveGUIFactory implements GUIFactory{

    @Override
    public ContolPanel createControlPanel() {
        return new MicrowaveControlPanel();
    }

    @Override
    public OnSwitchButton createOnSwitchButton() {
        return new MicrowaveOnSwitchButton();
    }
}
