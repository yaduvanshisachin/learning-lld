package StrategyDesignPattern.AuthenticationSystem;


//Context Class
class AuthenticationService {

    private AuthenticationStrategy strategy;

    public AuthenticationService(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean login(String username, String credential) {
        return strategy.authenticate(username, credential);
    }
}

//Client
public class Demo {

    public static void main(String[] args) {

        AuthenticationService authService =
                new AuthenticationService(new PasswordAuthentication());

        boolean result = authService.login("admin", "password123");
        System.out.println("Login Successful: " + result);

        System.out.println();

        authService.setStrategy(new GoogleAuthentication());
        result = authService.login("john", "google_abcd1234");
        System.out.println("Login Successful: " + result);

        System.out.println();

        authService.setStrategy(new OTPAuthentication());
        result = authService.login("john", "123456");
        System.out.println("Login Successful: " + result);
    }
}
