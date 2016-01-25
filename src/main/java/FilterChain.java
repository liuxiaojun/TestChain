import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();
    public FilterChain addFilter(Filter f) {
        this.filters.add(f);
        return this;
    }

    public void doFilter(String[] args,String[] upReturn) {
        String[] res = upReturn;
        for (Filter f: filters){
            f.doFilter(args,res);
            System.out.println(Arrays.toString(res));
        }
    }
}