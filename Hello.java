public class Hello {

    public String getUser(String userId) {
    String query = "SELECT * FROM users WHERE id = '" + userId + "'";
    return database.execute(query);
}
}
