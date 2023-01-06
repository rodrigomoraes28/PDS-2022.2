package DAO;

import User.User;

import java.util.ArrayList;

public final class usersDAO {
    private static usersDAO instance;
    ArrayList<User> users = new ArrayList<>();

    private usersDAO() {
    }

    public static usersDAO getInstance(){
        if(instance == null){
            instance = new usersDAO();
        }

        return instance;
    }

    public void setUsers(ArrayList<User> users){
        this.users.addAll(users);
    }


    @Override
    public String toString() {

        String string = "";

        for (User u: users){
            string += u.getName() +", ";
        }

        return string;
    }
}
