package com.manjeshk.designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo {

    public static void main(String[] args) throws Exception{

        System.out.println("--------------------------- Eager Loading ---------------------------");
        eagerLoading();

        System.out.println("--------------------------- Lazy Loading ---------------------------");
        lazyLoading();

        System.out.println("--------------------------- Thread Safe ---------------------------");
        threadSafe();

        System.out.println("--------------------------- Database Connection ---------------------------");
        databaseConnection();

    }

    /**
     * Eager loading object creation testing
     */
    private static void eagerLoading() {
        EagerLoading eagerLoadingObj1 = EagerLoading.getInstance();
        System.out.println("eagerLoadingObj1 = " + eagerLoadingObj1);

        EagerLoading eagerLoadingObj2 = EagerLoading.getInstance();
        System.out.println("eagerLoadingObj2 = " + eagerLoadingObj2);

        if (eagerLoadingObj1 == eagerLoadingObj2)
            System.out.println("Both are the same object.");
    }

    /**
     * Lazy loading object creation testing
     */
    private static void lazyLoading() {
        LazyLoading lazyLoadingObj1 = LazyLoading.getInstance();
        System.out.println("lazyLoadingObj1 = " + lazyLoadingObj1);

        LazyLoading lazyLoadingObj2 = LazyLoading.getInstance();
        System.out.println("lazyLoadingObj2 = " + lazyLoadingObj2);

        if (lazyLoadingObj1 == lazyLoadingObj2)
            System.out.println("Both are the same object.");
    }

    /**
     * Thread safe object creation testing
     */
    private static void threadSafe() {
        Threadsafe threadsafeObj1 = Threadsafe.getInstance();
        System.out.println("threadsafeObj1 = " + threadsafeObj1);

        Threadsafe threadsafeObj2 = Threadsafe.getInstance();
        System.out.println("threadsafeObj2 = " + threadsafeObj2);

        if (threadsafeObj1 == threadsafeObj2)
            System.out.println("Both are the same object.");
    }


    /**
     * Database connection object creation testing
     */
    private static void databaseConnection() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        System.out.println("connection = " + connection);

        //Statement statement = connection.createStatement();
        //TODO: perform database connection
        //statement.close();
    }

}
