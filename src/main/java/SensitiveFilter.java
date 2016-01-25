/**
 * Created by liuxiaojun on 16/1/25.
 */
public class SensitiveFilter implements Filter {
    
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setRequestStr(request.getRequestStr().replace("s","js"));
        chain.doFilter(request, response, chain);
        response.setResponseStr("-----------SensitiveFilter()");
    }

}