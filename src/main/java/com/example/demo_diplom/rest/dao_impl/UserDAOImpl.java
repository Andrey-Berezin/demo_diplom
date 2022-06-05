package com.example.demo_diplom.rest.dao_impl;


import com.example.demo_diplom.rest.dao.UserDAO;
import com.example.demo_diplom.rest.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getUserById(final int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void registerUser(final User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }


}
