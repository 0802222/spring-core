package d_aop.b_autoproxy;

import org.springframework.stereotype.Component;

@Component
public class Man {

    public String develop() {
        System.out.println("남자가 Python 으로 개발한다.");
        return "Man";
    }

}
