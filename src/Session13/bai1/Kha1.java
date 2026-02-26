package Session13.bai1;

import java.util.ArrayList;
import java.util.Iterator;

public class Kha1 {
    static void main(String[] args) {
        ArrayList<Double> nhietDo = new ArrayList<Double>();
        nhietDo.add(36.5);
        nhietDo.add(40.2);
        nhietDo.add(37.0);
        nhietDo.add(12.5);
        nhietDo.add(39.8);
        nhietDo.add(99.9);
        nhietDo.add(36.8);

        System.out.println(" danh sach nhiet do ban dau: "+ nhietDo);

        Iterator<Double> iterator = nhietDo.iterator();
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }
        System.out.println(" danh sach nhiet do sau khi xoa: "+ nhietDo);

        double sum  = 0.0;
        for (Double temp : nhietDo) {
            sum += temp;
        }
        double trungBinh = sum / nhietDo.size();
        System.out.println(" nhiet do trung binh: "+ trungBinh);
    }
}
