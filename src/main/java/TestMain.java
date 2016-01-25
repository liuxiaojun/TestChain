import java.util.Arrays;

/**
 * Created by liuxiaojun on 16/1/22.
 */
public class TestMain {
    public static void main(String[] args) {
        String[] msg = new String[81];
        msg[0] = "aaa";
        msg[1] = "bbb";
        msg[2] = "ccc";
        msg[3] = "ddd";
        msg[4] = "eee";
        msg[5] = "fff";

        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();
        //response.setResponseStr(msg);

        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SensitiveFilter());


        fc.doFilter(request, response, fc);

        //System.out.println(Arrays.toString(request.getRequestStr()));
        System.out.println(Arrays.toString(msg));

        System.out.println(Arrays.toString(response.getResponseStr()));

        //System.out.println(response);
    }
}

