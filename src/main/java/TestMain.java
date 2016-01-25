import java.util.Arrays;

/**
 * Created by liuxiaojun on 16/1/22.
 */
public class TestMain {
    public static void main(String[] args) {
        String line = ",1510022250571803293,182.97.20.249,2356019565055,,16,,,,,01,2,09,23,1452354961,,,202,%2csign9245C81CF30621FEF9519D76E9B35728,PUB_2405999,62313,0,2083,871347,,,,Dalvik%2f1.6.0%20%28Linux%3b%20U%3b%20Android%204.4.2%3b%20HUAWEI%20C199%20Build%2fHuaweiC199%29,,,,,73AB228037B305FA6EF60729B6A1B2BC,,4.4.2,HUAWEI+C199,1452354965030,0,com.tencent.qqlive,%e8%85%be%e8%ae%af%e8%a7%86%e9%a2%91,,0,,F5CA8A54885DC5E5548B71CBEECDD8BE,FB36EAD166517B522F878E79F93FF0C0,,720x1184,,,,,,,,,,,,,,,,,,,";
        String[] msg = line.split(",", -1);

        String[] res = new String[81];

        FilterChain fc = new FilterChain();

        fc.addFilter(new HTMLFilter());
        fc.addFilter(new AssignFilter());

        fc.doFilter(msg,res);
    }
}

