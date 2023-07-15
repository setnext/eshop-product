package com.setnext.eshop.products;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.setnext.eshop.products.entities.Category;
import com.setnext.eshop.products.entities.Product;
import com.setnext.eshop.products.interfaces.FileUploadSevice;
import com.setnext.eshop.products.repository.ProductRepository;
import com.setnext.eshop.products.repository.RangeRepository;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ProductsApplication implements ApplicationRunner {

	@Autowired
	FileUploadSevice storageService;

	@Autowired
	private ProductRepository product_repository;

	@Autowired
	private RangeRepository range_repository;

	@Value("${data.initialization.required}")
	private Boolean dataIntilaizationRequired;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(dataIntilaizationRequired);

		// TODO Auto-generated method stub

//		range_repository.deleteAll();
		storageService.init();


//		System.out.println(range_repository.findByCategoryId(3));
		if(dataIntilaizationRequired) {
			injectCategoryData();
			injectProductData();

		}





	}

	private void injectProductData() throws IOException, StreamReadException, DatabindException {
		System.out.println("Products Data Injection into DB Started");
		File resource = new ClassPathResource("products.json").getFile();
//			File file = new File(getClass().getResource("products.json").getFile());

		product_repository.deleteAll();

		ObjectMapper objectMapper = new ObjectMapper();
		List<Product> products = Arrays.asList(objectMapper.readValue(resource, Product[].class));

		 products.forEach(pdata->{

			 System.out.println("Product 1");
			 System.out.println(pdata);
			 product_repository.save(pdata);
		 });




		 System.out.println("Products Data Injection into DB Completed");
	}

	private void injectCategoryData() throws IOException, StreamReadException, DatabindException {
		System.out.println("Category Data Injection into DB Started");
		File resource = new ClassPathResource("categories.json").getFile();
//			File file = new File(getClass().getResource("products.json").getFile());

		range_repository.deleteAll();

		ObjectMapper objectMapper = new ObjectMapper();
		List<Category> categories = Arrays.asList(objectMapper.readValue(resource, Category[].class));

		categories.forEach(cdata->{


			 System.out.println(cdata);
			 range_repository.save(cdata);
		 });




		 System.out.println("Category Data Injection into DB Completed");
	}

}
