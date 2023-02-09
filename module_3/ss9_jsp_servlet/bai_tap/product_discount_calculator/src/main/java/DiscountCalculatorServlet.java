import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DiscountCalculatorServlet", value = "/calculator")
public class DiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("name");
        double priceCurrent = Double.parseDouble(request.getParameter("price"));
        double discountPer = Double.parseDouble(request.getParameter("discount"));
        double discountAmount = priceCurrent * discountPer * 0.01;
        double discountPrice = priceCurrent - discountAmount;
        request.setAttribute("name", productName);
        request.setAttribute("price", priceCurrent);
        request.setAttribute("discount", discountPer);
        request.setAttribute("disAmount", discountAmount);
        request.setAttribute("disPrice", discountPrice);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
