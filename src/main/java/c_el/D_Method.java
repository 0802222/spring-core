package c_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class D_Method {

    // 메서드도 호출 가능
    @Value("#{'hello'.toUpperCase()}")
    private String upperCase;

    // static method 도 호출 가능 (enum 만들고 Type 정보로 불러올수도 있음)
    @Value("#{T(java.lang.Math).random() * 100}")
    private double random;

    @Value("#{transactionManager.connect()}")
    private String connection;

    @Override
    public String toString() {
        return "D_Method{" +
            "upperCase='" + upperCase + '\'' +
            ", random=" + random +
            ", connection='" + connection + '\'' +
            '}';
    }
}
