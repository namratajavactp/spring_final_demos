package training.web.spring;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ProductController implements Controller {

	private ProductManager productManager;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String now = new java.util.Date().toString();

		Map myModel = new HashMap();
		myModel.put("now",now);
		myModel.put("products",getProductManager().getProducts());
		return new ModelAndView("product","model",myModel);
	}

	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}

	public ProductManager getProductManager() {
		return productManager;
	}
};