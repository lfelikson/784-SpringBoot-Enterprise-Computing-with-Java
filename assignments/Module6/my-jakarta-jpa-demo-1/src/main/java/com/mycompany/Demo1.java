package com.mycompany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.mycompany.model.Student;
import com.mycompany.model.Course;

public class Demo1
{
    public static void main( String[] args ) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try {
            emf = Persistence.createEntityManagerFactory("default");
            em = emf.createEntityManager();
            Student student1 = new Student("Student_1");
            Student student2 = new Student("Student_2");
            Student student3 = new Student("Student_3");
            Course course1 = new Course("605.784 - Enterprise computing with Java", "Computer Science");
            Course course2 = new Course("685.652 - Data Engineering Principles and Practice", "Data Science");

            //Insert
            em.getTransaction().begin();
            em.persist(student1);
            em.persist(student2);
            em.persist(student3);

            em.persist(course1);
            em.persist(course2);
            em.getTransaction().commit();
            
            //Find
            Student selectedStudent1 = em.find(Student.class, 1);
            System.out.println(selectedStudent1);
            Student selectedStudent2 = em.find(Student.class, 2);
            System.out.println(selectedStudent2);
            Student selectedStudent3 = em.find(Student.class, 3);
            System.out.println(selectedStudent3);

            Course selectedCourse1 = em.find(Course.class, 100);
            System.out.println(selectedCourse1);
            Course selectedCourse2 = em.find(Course.class, 101);
            System.out.println(selectedCourse2);

            //Delete
            em.getTransaction().begin();
            em.remove(em.find(Course.class, 100));
            em.getTransaction().commit();

            //Update
            em.getTransaction().begin();
            Course selectedCourse4 = em.find(Course.class, 101);
            selectedCourse4.setName("625.664 - Computational Statistics");
            em.persist(selectedCourse4);
            em.getTransaction().commit();

            // Find
            Course selectedCourse5 = em.find(Course.class, 101);
            System.out.println(selectedCourse5);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (emf != null) {
                emf.close();
            }
            if (em != null) {
                em.close();
            }
        }
    }
}