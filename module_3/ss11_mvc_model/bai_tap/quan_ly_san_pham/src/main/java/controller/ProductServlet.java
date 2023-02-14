package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();
    private void listProduct(HttpServletRequest request, HttpServletResponse response){
        List<Product> productList = this.iProductService.findAll();
        request.setAttribute("product",productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createForm(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createProduct(HttpServletRequest request, HttpServletResponse response){
        int id = (int) (Math.random() * 500);
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String status = request.getParameter("status");
        String manufacturer = request.getParameter("manufacturer");
        Product product = new Product(id,name,price,status,manufacturer);
        this.iProductService.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.iProductService.findByID(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher =  request.getRequestDispatcher("Product/error.jsp");
        }else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("Product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void updateProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String status = request.getParameter("status");
        String manufacturer = request.getParameter("manufacturer");
        Product product = this.iProductService.findByID(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher =  request.getRequestDispatcher("Product/error.jsp");
        }else {
            product.setName(name);
            product.setPrice(price);
            product.setStatus(status);
            product.setManufacturer(manufacturer);
            this.iProductService.update(id,product);
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("Product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.iProductService.findByID(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher =  request.getRequestDispatcher("Product/error.jsp");
        }else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("Product/delete.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.iProductService.findByID(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher =  request.getRequestDispatcher("Product/error.jsp");
        }else {
           this.iProductService.remove(id);
        }
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchProduct(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
            List<Product> productList = iProductService.search(name);
        RequestDispatcher dispatcher;
            if (productList == null){
                dispatcher =  request.getRequestDispatcher("Product/error.jsp");
            }else {
                request.setAttribute("productList", productList);
                dispatcher = request.getRequestDispatcher("Product/search.jsp");
            }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action) {
            case "create":
                createForm(request,response);
                break;
            case "edit":
                editForm(request,response);
                break;
            case "delete":
                deleteForm(request,response);
                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            default:
                break;
        }
    }
}
