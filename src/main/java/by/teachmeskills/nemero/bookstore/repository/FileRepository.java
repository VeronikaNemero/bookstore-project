package by.teachmeskills.nemero.bookstore.repository;

import by.teachmeskills.nemero.bookstore.entity.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileRepository implements ShopRepository{

    public List<User> userList = new ArrayList<>();

    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public void deleteByID(Long userID) {

    }

    @Override
    public Collection<User> allUsers() {
        return userList;
    }
}