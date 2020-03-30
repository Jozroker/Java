package mainPackage.core21.lesson.task1;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface WriteToFile {

    String type();

}
