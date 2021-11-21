
import hero_profile.hero_profile;
import services.UserService;

import java.sql.SQLException;

class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        hero_profile user = new hero_profile("Alex",26);
        userService.save(user);
    }
}