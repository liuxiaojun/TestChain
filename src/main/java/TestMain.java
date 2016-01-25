/**
 * Created by liuxiaojun on 16/1/22.
 */
public class TestMain {
    public static void main(String[] args) {
        String msg = "<script>";
        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();

        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SensitiveFilter());

        fc.doFilter(request, response, fc);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}

