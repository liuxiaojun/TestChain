/**
 * Created by liuxiaojun on 16/1/22.
 */
public class SensitiveFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {

        String arr[] = request.getRequestStr();


        System.out.println("============");
        System.out.println(arr.length);
        arr[1] = "111";

        //request.setRequestStr(arr);
        chain.doFilter(request, response, chain);
        response.setResponseStr(arr);
    }

}