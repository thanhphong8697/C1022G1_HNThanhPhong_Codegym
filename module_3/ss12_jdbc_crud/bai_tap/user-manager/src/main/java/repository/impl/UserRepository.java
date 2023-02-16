package repository.impl;

import model.User;
import repository.IUserRepository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public void add(User user) {
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().
//                    prepareStatement("insert into users(name, email, country) values (?,?,?)");
//            preparedStatement.setString(1,user.getName());
//            preparedStatement.setString(2,user.getEmail());
//            preparedStatement.setString(3,user.getCountry());
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call  insert_user (?, ?, ?)");
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findById(int id) {
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = BaseRepository.getConnection().prepareStatement("select  id, name, email, country from users where id = ?");
//            preparedStatement.setInt(1,id);
//            User user;
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()){
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                return user;
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = BaseRepository.getConnection().prepareCall("call  find_user_by_id (?)");
            callableStatement.setInt(1, id);
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> listAll(String countryName) {
        List<User> userList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().
//                    prepareStatement("select  id, name, email, country from users where country like concat('%' , ? , '%')");
//            preparedStatement.setString(1, countryName);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            User user;
//            while (resultSet.next()) {
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                userList.add(user);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return userList;

        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call  list_user (?)");
            callableStatement.setString(1, countryName);
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public void delete(int id) {
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("delete from users where id = ?");
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call delete _user (?)");
            callableStatement.setInt(1, id);
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = BaseRepository.getConnection().
//                    prepareStatement("update users\n" + "set name = ?, email = ?, country = ? \n" + "where id = ?");
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getEmail());
//            preparedStatement.setString(3, user.getCountry());
//            preparedStatement.setInt(4, user.getId());
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call  update_user (?, ?, ?, ?)");
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, user.getId());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

