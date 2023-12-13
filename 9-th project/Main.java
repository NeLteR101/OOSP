public class Main {
    public static void main(String[] args) {

        AppSettings appSettings = AppSettings.getInstance();
        System.out.println(appSettings.getAppName());
        System.out.println(appSettings.getMaxUsers());

        appSettings.setAppName("NewName App");
        appSettings.setMaxUsers(400);

        AppSettings appSettings2 = AppSettings.getInstance();
        System.out.println(appSettings2.getAppName());
        System.out.println(appSettings2.getMaxUsers());
    }
}