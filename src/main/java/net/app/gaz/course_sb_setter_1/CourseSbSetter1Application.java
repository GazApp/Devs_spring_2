package net.app.gaz.course_sb_setter_1;

import net.app.gaz.course_sb_setter_1.setter.Coche;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CourseSbSetter1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CourseSbSetter1Application.class, args);


        Coche coche = context.getBean(Coche.class);

        System.out.println(coche);
    }

}
