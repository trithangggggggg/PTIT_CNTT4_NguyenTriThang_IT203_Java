package Session06.Bai6;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Mật khẩu không được rỗng!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        User u1 = new User(1, "thangnguyen", "123456", "thang@gmail.com");
        u1.displayInfo();

        User u2 = new User(2, "user02", "abc123", "email_sai");
        u2.displayInfo();

        User u3 = new User(3, "user03", "", "user03@gmail.com");
        u3.displayInfo();

        u3.setPassword("newpass789");
        u3.setEmail("user03@gmail.com");
        u3.displayInfo();
    }
}
