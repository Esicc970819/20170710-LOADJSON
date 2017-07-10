package com.example.esicc.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String JSON_DATA = "{\n" +
            "page: 1,\n" +
            "notification: [\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62418-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-10 \",\n" +
            "title: \"106.07.10空氣品質\",\n" +
            "id: \"1\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://academic.kuas.edu.tw/files/13-1001-62417-1.php\",\n" +
            "info: {\n" +
            "department: \"教務處\",\n" +
            "date: \"2017-07-08 \",\n" +
            "title: \"教務處校務基金工作人員甄選結果公告\",\n" +
            "id: \"2\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://academic.kuas.edu.tw/files/13-1001-62415-1.php\",\n" +
            "info: {\n" +
            "department: \"教學發展中心\",\n" +
            "date: \"2017-07-07 \",\n" +
            "title: \"【轉知】高雄市工業會辦理「訓練規劃與評量職能基準課程」，有興趣且符合資格者歡迎報名。\",\n" +
            "id: \"3\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62414-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-07 \",\n" +
            "title: \"106.07.07空氣品質\",\n" +
            "id: \"4\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://iacc.kuas.edu.tw/?u=whGcuwWahRXZklHdpZXa0NWYvkHdpZXa0NWY&nsn=yUjN\",\n" +
            "info: {\n" +
            "department: \"產學合作中心\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"敬邀參加7/13(四)下午3點於高應大辦理之APEC創意設計競賽活動說明會\",\n" +
            "id: \"5\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://aac.kuas.edu.tw/files/13-1011-62413-1.php\",\n" +
            "info: {\n" +
            "department: \"校友聯絡中心\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"【高雄】城揚建設股份有限公司(職務:工程員)\",\n" +
            "id: \"6\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://aac.kuas.edu.tw/files/13-1011-62412-1.php\",\n" +
            "info: {\n" +
            "department: \"校友聯絡中心\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"【高雄】達業聯合會計師事務所(職務:記帳員)\",\n" +
            "id: \"7\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://kuasnews.kuas.edu.tw/files/13-1018-62341-1.php\",\n" +
            "info: {\n" +
            "department: \"產學合作中心\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"【訊息通知】-106/08/04-創新創業課程\",\n" +
            "id: \"8\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://military.kuas.edu.tw/files/13-1008-62331-1.php\",\n" +
            "info: {\n" +
            "department: \"軍訓室\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"內政部警政署來文針對常見之通訊軟體詐騙手法製作宣導教材\",\n" +
            "id: \"9\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://kuasnews.kuas.edu.tw/files/13-1018-62329-1.php\",\n" +
            "info: {\n" +
            "department: \"產學合作中心\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"【訊息通知】-107年度金屬機電智機化暨人才扎根分項提案說明會\",\n" +
            "id: \"10\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62323-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-06 \",\n" +
            "title: \"106.07.06空氣品質\",\n" +
            "id: \"11\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62280-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"「高級中等以下學校及幼兒園因應空氣品質惡化處理措施暨緊急應變作業流程」，業經本部於中華民國106年7月3日以臺教資(六)字第1060083450B號令修正發布\",\n" +
            "id: \"12\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62279-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"函轉行政院環境保護署辦理「107年度補助應回收廢棄物回收處理創新及研究發展計畫」公開徵求案，自即日起至106年8月14日受理收件，詳如說明，請查照。\",\n" +
            "id: \"13\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62278-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"函轉行政院環境保護署檢送「共通性事業廢棄物再利用管理辦法」草案預告影本，並附草案總說明及逐條說明，請查照。\",\n" +
            "id: \"14\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://academic.kuas.edu.tw/files/13-1001-62277-1.php\",\n" +
            "info: {\n" +
            "department: \"綜合教務組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"綜教組校務基金人員面試名單公告\",\n" +
            "id: \"15\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62267-1.php\",\n" +
            "info: {\n" +
            "department: \"安全衛生組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"教育部函轉勞動部職安署檢送修正之「管制性化學品許可申請作業手冊(第二 版)」1份，請查照。\",\n" +
            "id: \"16\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62266-1.php\",\n" +
            "info: {\n" +
            "department: \"安全衛生組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"教育部函轉行政院原子能委員會「放射性物料管理法」第25條修正草案已載於該會網站及公共政策網路參與平臺之眾開講，請本校查照。\",\n" +
            "id: \"17\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://www.eshc.kuas.edu.tw/files/13-1030-62265-1.php\",\n" +
            "info: {\n" +
            "department: \"環境保護組\",\n" +
            "date: \"2017-07-05 \",\n" +
            "title: \"106.07.05空氣品質\",\n" +
            "id: \"18\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://academic.kuas.edu.tw/files/13-1001-62235-1.php\",\n" +
            "info: {\n" +
            "department: \"教學發展中心\",\n" +
            "date: \"2017-07-04 \",\n" +
            "title: \"客家委員會公告「獎助客家研究優良博碩士論文作業要點」如附件，歡迎研究生踴躍申請！\",\n" +
            "id: \"19\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://academic.kuas.edu.tw/files/13-1001-62221-1.php\",\n" +
            "info: {\n" +
            "department: \"教學發展中心\",\n" +
            "date: \"2017-07-04 \",\n" +
            "title: \"106學年度甄選入學正、備取生名單公告\",\n" +
            "id: \"20\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://student.kuas.edu.tw/files/13-1002-62224-1.php\",\n" +
            "info: {\n" +
            "department: \"校外賃居服務中心\",\n" +
            "date: \"2017-07-04 \",\n" +
            "title: \"租屋注意事項 務必要看！！！\",\n" +
            "id: \"21\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://academic.kuas.edu.tw/files/13-1001-62214-1.php\",\n" +
            "info: {\n" +
            "department: \"教學發展中心\",\n" +
            "date: \"2017-07-04 \",\n" +
            "title: \"【轉知】國家教育研究院辦理12年國民基本教育社會領域課程綱要(草案)公聽會及網路論壇,歡迎報名參加。\",\n" +
            "id: \"22\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://gen.kuas.edu.tw/files/13-1013-62203-1.php\",\n" +
            "info: {\n" +
            "department: \"總務處\",\n" +
            "date: \"2017-07-03 \",\n" +
            "title: \"國立高雄應用科技大學採購人員(一般行政組員)徵才公告\",\n" +
            "id: \"23\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://aac.kuas.edu.tw/files/13-1011-62212-1.php\",\n" +
            "info: {\n" +
            "department: \"校友聯絡中心\",\n" +
            "date: \"2017-07-03 \",\n" +
            "title: \"【高雄】臥龍維修服務有限公司(職務:工務部人員)\",\n" +
            "id: \"24\"\n" +
            "}\n" +
            "},\n" +
            "{\n" +
            "link: \"http://aac.kuas.edu.tw/files/13-1011-62211-1.php\",\n" +
            "info: {\n" +
            "department: \"校友聯絡中心\",\n" +
            "date: \"2017-07-03 \",\n" +
            "title: \"【高雄】宇豐金屬國際有限公司(職務:會計助理)\",\n" +
            "id: \"25\"\n" +
            "}\n" +
            "}\n" +
            "]\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parse();
    }


    private void parse() {

        try {
            JSONObject obj = new JSONObject(JSON_DATA);
            int page = obj.getInt("page");
            JSONArray array = obj.getJSONArray("notification");
            for (int i=0; i<array.length(); i++){
                JSONObject obj2 = array.getJSONObject(i);
                String link = obj2.getString("link");

                JSONObject obj3 = obj2.getJSONObject("info");
                String department = obj3.getString("department");
                String date = obj3.getString("date");
                String title = obj3.getString("title");
                int id = obj3.getInt("id");

                Log.e("JSON:",page+"/"+link+" /"+"/"+department+"/"+date+"/"+title+"/"+id);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
