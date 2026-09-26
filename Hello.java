public class Hello {

    public String getUser(String userId) {
    String query = "SELECT * FROM users WHERE id = '" + userId + "'";
    // Testing AI code review webhook
    return database.execute(query);
}
}
