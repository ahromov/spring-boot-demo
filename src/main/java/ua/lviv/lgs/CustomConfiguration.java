package ua.lviv.lgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


import java.util.Map;

@Configuration
public class CustomConfiguration {

	@Autowired
    private final Map<String, Object> stringStudentMap;

    public CustomConfiguration(Map<String, Object> stringStudentMap) {
        this.stringStudentMap = stringStudentMap;
    }

    public Object getBean(String name) {
        return stringStudentMap.get(name);
    }
}
