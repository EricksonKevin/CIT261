/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin;

import java.util.*;

import org.hibernate.Session;


public class Data {
    
    public static void main(String[] args) {
    }
    
    private Members m;
    private HibernateUtil helper;
    private Session session;
    
    public void addMember(String name) {
        m = new Members("James");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
    
}

