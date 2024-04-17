package com.mycompany;

// import javax.persistence.*;

import jakarta.persistence.*;

// import javax.persistence.criteria.CriteriaBuilder;
// import javax.persistence.criteria.CriteriaQuery;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Selection;

import java.util.Arrays;
import java.util.List;
import com.mycompany.Student;

public class JPAExample {

    public static void main(String[] args) {

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("testPersistenceUnit");
        
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Student student1 = new Student();
        student1.setName("StudentX");
        entityManager.persist(student1);

        System.out.println("----\nStudentX inserted");

        Student student2 = new Student();
        student2.setName("StudentY");
        entityManager.persist(student2);

        System.out.println("----\nStudentY inserted");

        entityManager.getTransaction().commit();

        System.out.println("----\nTransaction commited");

        findStudentById(entityManager);
        queryWithJPQL(entityManager);
        typedQueryWithJPQL(entityManager);
        criteriaQuery(entityManager);
        queryNative(entityManager);
    }

    private static void findStudentById(EntityManager entityManager) {
        System.out.println("----\nFinding student by id");
        Student o = entityManager.find(Student.class, 2L);
        System.out.println(o);
    }

    private static void queryWithJPQL(EntityManager entityManager) {
        System.out.println("----\nQuerying using JPQL");
        Query query = entityManager.createQuery("select t from Student t");
        List resultList1 = query.getResultList();
        System.out.println(resultList1);
    }

    private static void typedQueryWithJPQL(EntityManager entityManager) {
        System.out.println("----\nTyped Querying using JPQL");
        TypedQuery<Student> q =
                entityManager.createQuery("select t from Student t"
                        , Student.class);
        System.out.println(q.getResultList());
    }

    private static void queryNative(EntityManager entityManager) {
        System.out.println("----\nnative query");
        Query nativeQuery = entityManager.createNativeQuery("select * from Student");
        List resultList = nativeQuery.getResultList();
        for (Object o : resultList) {
            if (o.getClass().isArray()) {
                Object oa[] = (Object[]) o;
                System.out.println(Arrays.asList(oa));
            } else {
                System.out.println(o);
            }
        }
    }

    private static void criteriaQuery(EntityManager entityManager) {
        System.out.println("----\ncriteria query");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object> query = cb.createQuery();
        CriteriaQuery<Object> select = query.select(query.from(Student.class));

        TypedQuery<Object> typedQuery = entityManager.createQuery(select);
        System.out.println(typedQuery.getResultList());

    }
}
