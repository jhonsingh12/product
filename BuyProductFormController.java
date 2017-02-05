package com.flipkart.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.flipkart.command.ProductCommand;
import com.flipkart.dto.ProductDto;
import com.flipkart.service.ProductService;

public class BuyProductFormController extends SimpleFormController {
	private ProductService productService;

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ProductCommand productCmd = null;
		ModelAndView mav = null;
		String orderId = null;

		productCmd = (ProductCommand) command;
		orderId = productService.placeOrder(productCmd);

		mav = new ModelAndView();
		mav.addObject("orderId", orderId);
		mav.setViewName("orderconfirm");

		return mav;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		int productId;
		ProductDto productDto = null;
		ProductCommand command = null;

		command = new ProductCommand();
		productId = Integer.parseInt(request.getParameter("pid"));
		productDto = productService.getProductById(productId);
		command.setProductId(productDto.getProductId());
		command.setProductNm(productDto.getProductNm());
		command.setDescr(productDto.getDescr());
		command.setPrice(productDto.getPrice());
		command.setQuantity(1);

		return command;
	}
	
	

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<String, Object> dataMap = null;
		List<Integer> quantities=  null;
		dataMap = new HashMap<String, Object>();
		
		quantities = new ArrayList<Integer>();
		quantities.add(1);
		quantities.add(2);
		quantities.add(3);
		quantities.add(4);
		quantities.add(5);
		
		dataMap.put("quantities", quantities);
		return dataMap;
	}
	
	

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("dupformerror");
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
