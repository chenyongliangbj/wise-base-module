package com.chenyl.module.hanshow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import static com.chenyl.module.utils.HttpClientUtil2.httpGetRequest;

/**
 * 批量录入工时
 */
public class MonHours {

    public static void main(String[] args) throws ParseException {

        //年月日
        int year = 2019;
        int month = 4;
        int day = 9;
        //添加几天
        for (int i = 0; i < 3; i++) {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

            Calendar c = Calendar.getInstance();
            c.set(year,month-1,day);
            System.out.println("当前日期:"+sf.format(c.getTime()));

            try {
                Map<String, Object> returnMap = new HashMap<>();
                returnMap.put("input_add_date", sf.format(c.getTime()));
                returnMap.put("input_add_project_id", "162");
                returnMap.put("input_add_task_id", "3");
                returnMap.put("input_add_remark", "区域库存模块开发");
                returnMap.put("input_add_duration", " 8");
//            request.addHeader("Cookie","JSESSIONID=AC5DC4739FC60070DBC422B219B5DC07");//JSESSIONID=AC5DC4739FC60070DBC422B219B5DC07
                Map<String, Object> header = new HashMap<>();
                header.put("Cookie", "JSESSIONID=6EB5E23405FCB78F72D81543C2CCED60");
                String s = httpGetRequest("http://192.168.2.85:8080/QualityMeasureSys/timesheet/addTimesheet", header, returnMap);
                System.out.println(s);
            } catch (Exception e) {
                System.out.println(e);
            }


            c.add(Calendar.DAY_OF_MONTH, 1);
            c.set(year,month-1,++day);
            System.out.println("增加一天后日期:"+sf.format(c.getTime()));
        }
    }
}
