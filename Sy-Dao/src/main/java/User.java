public class User {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private String Email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(int id, String username, String password, String nickname, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        Email = email;
    }
    public User(String username, String password, String nickname, String email) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        Email = email;
    }
    public User() {}

}
