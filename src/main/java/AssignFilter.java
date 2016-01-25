import java.util.Arrays;

public class AssignFilter implements Filter {
    public void doFilter(String[] args,String[] res) {
        //System.out.println("assign");
        res[1] = "222";

    }
}