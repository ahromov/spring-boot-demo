package ua.lviv.lgs.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;


@Component
@Data
@EqualsAndHashCode
public class BaseBean {

    protected Integer id;
    protected String name;
    protected Integer age;

    @Override
    public String toString() {
        return "BaseBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
