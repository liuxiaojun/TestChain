public class HTMLFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {

        //String arr[] = response.getResponseStr();
        String arr[] = request.getRequestStr();
        System.out.println("============");
        System.out.println(arr.length);
        arr[0] = "000";

        //request.setRequestStr(arr);
        chain.doFilter(request, response, chain);
        response.setResponseStr(arr);
    }
}