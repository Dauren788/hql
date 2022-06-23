package com.example.hibernate;

import com.example.hibernate.dao.UserDAOImpl;
import com.example.hibernate.entity.Category;
import com.example.hibernate.entity.Role;
import com.example.hibernate.entity.Task;
import com.example.hibernate.entity.User;
//import jakarta.persistence.Query;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info("Hibernate JasAcademy");
        Session session = HibernateUtil.getSessionFactory().openSession();

        //One to Many
//        Query<Category> query = session.createQuery("from Category");
//        query.setMaxResults(10);
//
//        List<Category> categories = query.getResultList();
//        for (Category c : categories) {
//            System.out.println(c.getTitle());
//        }

        //Many to Many
//        Query<User> query = session.createQuery("from User");
//        query.setMaxResults(2);
//
//        List<User> users = query.getResultList();
//
//        System.out.println(users.get(0).getUsername());

//        User u1 = session.get(User.class, 10025L);
//        log.info(u1);
//        session.close();
//////
//        session = HibernateUtil.getSessionFactory().openSession();
//        User u2 = session.get(User.class, 10025L);
//        log.info(u2);
////
//        session.close(); // закрыть сессию
//
//        log.info("hit " + HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCacheHitCount());
//        log.info("miss " + HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCacheMissCount());
//        log.info("pub " + HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCachePutCount());
//
//        for (String s: HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCacheRegionNames()) {
//            log.info(s);
//        }



        //delete
//        session.beginTransaction();
//        User u1 = session.get(User.class, 10027L);
//        session.delete(u1);
//
//        session.getTransaction().commit();
//        log.info(u1.getCategories());
//        session.close();


        //Task
//        Task t1 = session.get(Task.class, 50169L);
//        log.info(t1);
//        //t1.getUser();
//        session.close();



        //добавление юзера
//        UserDAOImpl userDAO = new UserDAOImpl();
//
//        User u = new User();
//        u.setPassword("passwordpswd");
//        u.setUsername("usernameeeee");
//        u.setEmail("email777777@asdf.com");
//        userDAO.add(u);

        //update with delete role
//        UserDAOImpl userDAO = new UserDAOImpl();
//
//        User u = new User();
//        u.setId(20023L);
//        u.setPassword("password8");
//        u.setUsername("username20023");
//        u.setEmail("makhanov123456@gmail.com");
//        userDAO.update(u);

        //delete
//        UserDAOImpl userDAO = new UserDAOImpl();
//        userDAO.delete(20028L);

        //get
//        UserDAOImpl userDAO = new UserDAOImpl();
//        log.info(userDAO.get(20023L).getRoles());

//        User user = session.get(User.class, 20023L); // получаем единичный объект
//        log.info(user);
//        session.close();

        UserDAOImpl userDAO = new UserDAOImpl();
        log.info(userDAO.findAll());

        HibernateUtil.close(); // закрыть Session Factory
    }
}
