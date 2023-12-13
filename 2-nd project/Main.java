public class Main {
    public static void main(String[] args) {

        GUIFactory refrigeratorFactory = new RefrigeratorGUIFactory();
        refrigeratorFactory.createControlPanel();
        refrigeratorFactory.createOnSwitchButton();

        // Создание фабрики для стиральной машины и создание экземпляра стиральной машины
        GUIFactory washingMachineFactory = new WashingMachineGUIFactory();
        washingMachineFactory.createOnSwitchButton();
        washingMachineFactory.createControlPanel();

        // Создание фабрики для микроволновой печи и создание экземпляра микроволновой печи
        GUIFactory microwaveFactory = new MicrowaveGUIFactory();
        washingMachineFactory.createControlPanel();
        washingMachineFactory.createOnSwitchButton();

    }
}