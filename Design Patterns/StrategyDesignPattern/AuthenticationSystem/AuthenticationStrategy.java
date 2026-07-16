package StrategyDesignPattern.AuthenticationSystem;

public interface AuthenticationStrategy{
    boolean authenticate(String username, String credentials);
}

class PasswordAuthentication implements AuthenticationStrategy {

    @Override
    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating using Username & Password...");

        // Dummy validation
        return "admin".equals(username) && "password123".equals(password);
    }
}

class GoogleAuthentication implements AuthenticationStrategy {

    @Override
    public boolean authenticate(String username, String token) {
        System.out.println("Authenticating using Google OAuth...");

        // Simulate OAuth token validation
        return token.startsWith("google_");
    }
}

class OTPAuthentication implements AuthenticationStrategy {

    @Override
    public boolean authenticate(String username, String otp) {
        System.out.println("Authenticating using OTP...");

        return "123456".equals(otp);
    }
}