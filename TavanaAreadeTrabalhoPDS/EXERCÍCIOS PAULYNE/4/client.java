import DAO.usersDAO;
import User.User;

import java.util.ArrayList;

public class client {
    public static void main(String[] args) {

        ArrayList<User> users1 = new ArrayList<>();
        users1.add(new User("Lucas", 19));
        users1.add(new User("Laparo", 22));

        ArrayList<User> users2 = new ArrayList<>();
        users2.add(new User("Sandro come merda", 19));
        users2.add(new User("Lorena cu pode", 22));

        usersDAO usersDAO1 = DAO.usersDAO.getInstance();
        usersDAO usersDAO2 = DAO.usersDAO.getInstance();



        usersDAO1.setUsers(users1);
        usersDAO2.setUsers(users2);

        System.out.println(usersDAO1);

    }
}
