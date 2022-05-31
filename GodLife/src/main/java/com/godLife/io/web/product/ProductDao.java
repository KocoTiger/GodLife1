package com.godLife.io.web.product;

import java.util.List;

import com.godLife.io.service.domain.Product;



public interface ProductDao {
	
	// INSERT (기존 내용_참고용)
	public void addProduct(Product product) throws Exception ;

	// SELECT ONE (기존 내용_참고용)
	public Product getProduct(int productNo) throws Exception ;

	// SELECT LIST (기존 내용_참고용)
	public List<Product> getProductList(Search search) throws Exception ;

	// UPDATE (기존 내용_참고용)
	public void updateProduct(Product product) throws Exception ;

	// DELETE (금번 추가)
	public void deleteProduct() throws Exception ;
	
	
}