class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName) {
        System.out.println(name + ", у вас назначена новая задача: " + taskName);
    }
}