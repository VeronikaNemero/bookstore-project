package by.teachmeskills.nemero.bookstore.repository;

import by.teachmeskills.nemero.bookstore.entity.User;

import java.util.Collection;

public interface ShopRepository {

    public void add(User user);

    public void deleteByID(Long userID);

    public Collection<User> allUsers();
}
