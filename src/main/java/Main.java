import models.Auto;
import models.User;
import services.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User masha = new User("Маша", 26);

        userService.save(masha);
        List<User> users = (ArrayList<User>) userService.findAllUsers();
        for (User user: users) {
            System.out.println(user);
        }

        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(masha);
        masha.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        ford.setUser(masha);
        masha.addAuto(ford);

        userService.updateUser(masha);

        masha.setName("Sveta");
        userService.updateUser(masha);
        userService.delete(masha);
    }
}
