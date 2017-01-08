//package com.altarix.util;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.com.altarix.users.service.ServiceRegistry;
//import org.hibernate.com.altarix.users.service.ServiceRegistryBuilder;
//
//import java.io.File;
//
//public class HibernateUtil {
//    private static final SessionFactory ourSessionFactory;
//    private static final ServiceRegistry serviceRegistry;
//
//    static {
//        try {
//            Configuration configuration = new Configuration();
//            configuration.configure(new File("G:/java/AltarixTask/AltarixTask/out/artifacts/unnamed/WEB-INF/classes/hibernate.cfg.xml"));
//
//            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
//        } catch (Throwable ex) {
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static Session getSession() throws HibernateException {
//        return ourSessionFactory.openSession();
//    }
//}
