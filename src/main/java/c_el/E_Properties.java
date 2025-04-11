package c_el;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class E_Properties {

    // ${} : 속성 클래스 홀더, Spring 의 속성값을 참조하는 용도
    // 어떤걸 불러도 String 으로 반환됨

    // Spring 의 환경변수 값을 등록해줘야함 (run class 에 등록함)
    @Value("${lecture.name}")
    private String name;

    @Value("${lecture.age}")
    private String age;

    @Value("${lecture.subject}")
    private List<String> subject;

    @Value("${lecture.progress}")
    private String progress;

    // : property 를 찾을 수 없는 경우 기본값 지정
    @Value("${lecture.none:spring el}")
    private String none;

    @Override
    public String toString() {
        return "E_Properties{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", subject=" + subject +
            ", progress='" + progress + '\'' +
            ", none='" + none + '\'' +
            '}';
    }
}
