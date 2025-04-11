package a_regist.a_xml.cheatsheet;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CheatSheet {

    private Status status;
    private LocalDate now;

    public CheatSheet(LocalDate now) {
        System.out.println("매개변수가 있는 생성자" + now);
    }

    public void setStatus(Status status){
        System.out.println("setStatus" + status);
    }

    public void setNumber(int num){
        System.out.println("setNumber" + num);
    }

    public void setArray(String[] arr){
        System.out.println("String[]" + arr);
    }

    public void setList(List<?> list){
        System.out.println("List<?>" + list);
    }

    public void setSet(Set<?> set){
        System.out.println("Set<?>" + set);
    }

    public void setMap(Map<?, ?> map){
        System.out.println("Map<?, ?>" + map);
    }

    public void setProperties(Properties props){
        System.out.println("Properties" + props);
    }

    public void setScore(Score score){
        System.out.println("setScore" + score);
    }

    public void setScores(List<Score> scores){
        System.out.println("setScores" + scores);
    }
}
