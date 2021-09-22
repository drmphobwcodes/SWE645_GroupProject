package com.swe645.hw3.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.swe645.hw3.model.SurveyForm;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

public class EntityManager {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }


    public static void main(String[] argv) {
    }

    public static SurveyForm addSurvey(SurveyForm survey) {
        Transaction tx;
        try (Session session = getSession()) {
            tx = session.beginTransaction();
            session.save(survey);
            tx.commit();
            return survey;
        }
    }

    public static List<SurveyForm> getAllSurveys() {
        List<SurveyForm> result;

        try (Session session = getSession()) {
            Transaction tx;
            tx = session.beginTransaction();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<SurveyForm> criteria = builder.createQuery(SurveyForm.class);
            criteria.from(SurveyForm.class);
            result = session.createQuery(criteria).getResultList();

            tx.commit();
            return result;
        }
    }


    public static SurveyForm getSurvey(String id) {
        try (Session session = getSession()) {
            Transaction tx;
            tx = session.beginTransaction();

            SurveyForm result = session.get(SurveyForm.class, id);

            tx.commit();
            return result;


        }
    }

    public static List<String> getAllStudentIDs() {
        List<String> result;

        try (Session session = getSession()) {
            Transaction tx;
            tx = session.beginTransaction();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<String> criteria = builder.createQuery(String.class);
            Root<SurveyForm> root = criteria.from(SurveyForm.class);
            criteria.select(root.get("studentId"));
            result = session.createQuery(criteria).getResultList();

            tx.commit();
            return result;
        }
    }
}