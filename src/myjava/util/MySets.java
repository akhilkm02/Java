package myjava.util;

import myjava.util.helper.Student;

import java.util.*;
import java.util.logging.Logger;

public class MySets {
    public static final Logger log=Logger.getLogger(MySets.class.getName());

    public static void main(String[] args) {
        //HashSet
        log.info("Hash set************");
        Set<Student> students=new HashSet<>();
        students.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        students.add(new Student("Vimal",10,10, Arrays.asList("English","Maths")));
        students.add(new Student("Bimal",10,10, Arrays.asList("English","Maths")));
        students.add(new Student("Rimal",10,10, Arrays.asList("English","Maths")));
        students.forEach(student -> {
            log.info(students.toString());
        });

        //LinkedHashSet
        log.info("LinkedHashSet********");
        Set<Student> st=new LinkedHashSet<>();
        st.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        st.add(new Student("Vimal",10,10, Arrays.asList("English","Maths")));
        st.add(new Student("Bimal",10,10, Arrays.asList("English","Maths")));
        st.forEach(student -> {
            log.info(st.toString());
        });


        //LinkedHashSet
        log.info("TreeSet********");
        Set<Student> st1=new TreeSet<Student>();
        st1.add(new Student("Vimal",10,10, Arrays.asList("English","Maths")));
        st1.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        st1.add(new Student("Sanil",10,10, Arrays.asList("English","Maths")));

        st1.forEach(student -> {
            log.info(st1.toString());
        });


    }
}
