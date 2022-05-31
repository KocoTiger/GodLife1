package com.godLife.io.web.product;

import java.util.List;

import com.godLife.io.service.domain.Product;



public interface ProductDao {
	
	// INSERT (���� ����_�����)
	public void addProduct(Product product) throws Exception ;

	// SELECT ONE (���� ����_�����)
	public Product getProduct(int productNo) throws Exception ;

	// SELECT LIST (���� ����_�����)
	public List<Product> getProductList(Search search) throws Exception ;

	// UPDATE (���� ����_�����)
	public void updateProduct(Product product) throws Exception ;

	// DELETE (�ݹ� �߰�)
	public void deleteProduct() throws Exception ;
	
	
}