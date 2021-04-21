package com.example.swagger.swaggerdemo;

import com.example.swagger.swaggerdemo.api.WowApi;
import com.example.swagger.swaggerdemo.models.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-20T15:13:50.555056500+05:30[Asia/Calcutta]")
//@Controller
public class WowApiController implements WowApi {

    private static final Logger log = LoggerFactory.getLogger(WowApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WowApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> addProduct(@ApiParam(value = "Product object that needs to be added to the Ekart" ,required=true )  @Valid @RequestBody Product body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Product>> getAllProductsInEkart() {
		/*
		 * String accept = request.getHeader("Accept"); if (accept != null &&
		 * accept.contains("application/json")) { try { return new
		 * ResponseEntity<List<Product>>(objectMapper.
		 * readValue("[ {\r\n  \"productAvalilability\" : true,\r\n  \"productManufactureName\" : \"productManufactureName\",\r\n  \"productId\" : 0,\r\n  \"productName\" : \"productName\",\r\n  \"productType\" : \"productType\"\r\n}, {\r\n  \"productAvalilability\" : true,\r\n  \"productManufactureName\" : \"productManufactureName\",\r\n  \"productId\" : 0,\r\n  \"productName\" : \"productName\",\r\n  \"productType\" : \"productType\"\r\n} ]"
		 * , List.class), HttpStatus.NOT_IMPLEMENTED); } catch (IOException e) {
		 * log.error("Couldn't serialize response for content type application/json",
		 * e); return new
		 * ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR); } }
		 */
    	Product product = new Product();
    	List<Product> products = new ArrayList();
    	product.setProductAvalilability(true);
    	product.setProductId(1L);
    	product.setProductManufactureName("Real me");
    	product.setProductType("Electronic");
    	product.setProductName("Mobile");
    	products.add(product);
    	
        return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
    }

}
