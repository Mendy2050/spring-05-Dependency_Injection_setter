package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String databaseName;
    private int connectionNum;

    ////Setter injection requires the providing of the set method for the object to be injected
    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    ////Setter injection requires the providing of the set method for the object to be injected
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }
}
