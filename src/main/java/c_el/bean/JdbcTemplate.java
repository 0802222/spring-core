package c_el.bean;

import org.springframework.stereotype.Component;

@Component("mysqlTemplate")  //이름 지정 : 원하는 이름으로 넣어서 호출함
public class JdbcTemplate {


    @Override
    public String toString() {
        return "JdbcTemplate";
    }
}
