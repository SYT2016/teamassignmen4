/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储里面是AirlinerProfile的arraylist，相当于全中国所有的航空空司的信息
 * AirlinerProfile里面包括航空公司名字+一个航空公司的详细信息+该航空公司旗下的所有Flight的List
 *
 * @author Cong
 */
public class AirlinerDirectory {

    private static final ArrayList<Airliner> AIRLINER_LIST = new ArrayList<>();

    public static void addAirliner(Airliner airliner) {
        AIRLINER_LIST.add(airliner);
    }

    public List<Airliner> getAirlinerList() {
        return AIRLINER_LIST;
    }
}
