import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/8/13.
 */
public class test
{
    public static void main(String[] args) {
        Appmain a = new Appmain();
        a.setX(5);a.setY(10);
        Appmain b=new Appmain();
        b.setX(5);b.setY(10);
        System.out.println(a.getX());
        List<Appmain>list=new ArrayList<>();
        list.add(a);
        list.add(b);
        System.out.print(list.get(0).getX());
        System.out.print(list.get(1).getY());
    }
}
