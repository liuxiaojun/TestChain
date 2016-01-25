public class HTMLFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setRequestStr(request.getRequestStr().replace('<', '[').replace('>', ']'));
        chain.doFilter(request, response, chain);
        response.setResponseStr("-----------HtmlFilter()");
    }
}