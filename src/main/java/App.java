
public class App {
    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(10);
        System.out.println("Згенерований пароль: " + password);
    }
}
