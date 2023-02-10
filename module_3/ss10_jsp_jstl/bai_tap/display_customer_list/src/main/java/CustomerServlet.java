import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customerList = new ArrayList<>();

    public void init() {
        customerList.add(new Customer("Mai Văn Hoàn", "1983/08/20", "Hà Nội",
                "https://sohanews.sohacdn.com/2018/10/8/photo-1-1539002061484589013767.png"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983/08/21", "Bắc Giang",
                "https://sohanews.sohacdn.com/2018/10/8/photo-1-1539002061484589013767.png"));
        customerList.add(new Customer("Nguyễn Thái Hoà", "1983/08/22", "Nam Định",
                "https://sohanews.sohacdn.com/2018/10/8/photo-1-1539002061484589013767.png"));
        customerList.add(new Customer("Trần Đăng Khoa", "1983/08/17", "Hà Tây",
                "https://sohanews.sohacdn.com/2018/10/8/photo-1-1539002061484589013767.png"));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983/08/19", "Hà Nội",
                "https://sohanews.sohacdn.com/2018/10/8/photo-1-1539002061484589013767.png"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/customer_list.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
