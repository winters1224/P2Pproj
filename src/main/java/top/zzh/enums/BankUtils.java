package top.zzh.enums;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class BankUtils {

    private static final Map<String, JSONObject> BANK_RESULT;

    static {
        BANK_RESULT = new HashMap<>();
        // 绑卡成功
        BANK_RESULT.put("http://localhost:8081/bank/bind", JSONObject.fromObject("{\"code\":\"1000\"}"));
        // 充值成功
        BANK_RESULT.put("http://localhost:8081/bank/recharge", JSONObject.fromObject("{\"code\":\"3000\"}"));
        // 提现成功
        BANK_RESULT.put("http://localhost:8081/bank/mention", JSONObject.fromObject("{\"code\":\"4000\"}"));

    }

    /**
     * 屏蔽掉实际的请求，每次都返回成功。
     *
     * @param url
     * @param params
     * @return
     */
    public static JSONObject jsonObject(String url, String params){
        /*String bind= top.zzh.common.HttpUtils.sendPost(url,params);
        JSONObject jsonObject= JSONObject.fromObject(bind);
        return jsonObject;*/

        return BANK_RESULT.get(url);
    }


}
