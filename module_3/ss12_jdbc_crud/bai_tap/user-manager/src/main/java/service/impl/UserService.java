package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    IUserRepository iUserRepository = new UserRepository();

    @Override
    public void add(User user) {
        iUserRepository.add(user);
    }

    @Override
    public User findById(int id) {
        return iUserRepository.findById(id);
    }

    @Override
    public List<User> listAll(String countryName) {
        if (countryName == null) {
            countryName = "";
        }
        return iUserRepository.listAll(countryName);
    }

    @Override
    public void delete(int id) {
        iUserRepository.delete(id);
    }

    @Override
    public void update(User user) {
        iUserRepository.update(user);
    }

}
