package c_el;

import c_el.bean.JdbcProperties;
import c_el.bean.TransactionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//Bean 참조, 속성가져오기 가능
@Component
public class C_BeanRef {

    @Value("#{transactionManager.jdbcProperties}")
    private JdbcProperties oracleProperties;

    @Value("#{transactionManager}")
    private TransactionManager transactionManager;

    @Override
    public String toString() {
        return "C_BeanRef{" +
            "oracleProperties=" + oracleProperties +
            ", transactionManager=" + transactionManager +
            '}';
    }
}
