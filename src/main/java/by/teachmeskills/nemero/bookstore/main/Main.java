package by.teachmeskills.nemero.bookstore.main;

import by.teachmeskills.nemero.bookstore.entity.User;
import by.teachmeskills.nemero.bookstore.repository.FileRepository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(101, "Peter", "Parker", "petpark99", "54778h3");
        User user2 = new User(1007, "James", "Brown", "jjjjb7", "jhjh7");
        User user3 = new User(101, "Nancy", "Drew", "nancy_drew", "uuehh5");


        FileRepository fileRepository = new FileRepository();
        fileRepository.add(user1);
        fileRepository.add(user2);
        fileRepository.add(user3);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\coding\\с72\\bookstore-project\\src\\main\\resources\\saved.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(fileRepository.allUsers());
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
