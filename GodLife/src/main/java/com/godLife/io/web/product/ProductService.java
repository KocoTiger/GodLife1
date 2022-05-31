package com.godLife.io.web.product;


import java.util.Map;

import com.godLife.io.service.domain.Product;



public interface ProductService {
	
	// ��ǰ�߰� (���� ����_�����)
	public void addProduct(Product product) throws Exception;
	
	// �ű� ��ǰ�� ��ǰ ��� UI ��û
	public void addProductCouponView(Product product) throws Exception;	
	// �ű� ��ǰ�� ��ǰ ��� UI ��û
	public void addProductVoucherView(Product product) throws Exception;
	// �ű� ��ǰ�� ��ǰ ��� UI ��û
	public void addProductPointView(Product product) throws Exception;	
	
	
	// �ű� ���� ��ǰ ��� �Ϸ� �Ϸ� ��û
	public void addProductCoupon(Product product) throws Exception;
	// �ű� ���� ��ǰ ��� Ȯ�� ��û
	public void addProductCouponConfirm(Product product) throws Exception;
	//�ű� ��ǰ�� ��ǰ ��� �Ϸ� ��û
	public void addProductVoucher(Product product) throws Exception;
	//�ű� ��ǰ�� ��ǰ ��� Ȯ�� ��û
	public void addProductVoucherConfirm(Product product) throws Exception;
	// �ű� ����Ʈ ��ǰ ��� �Ϸ� Ȯ�� ��û
	public void addProductPoint(Product product) throws Exception;
	//�ű� ����Ʈ ��ǰ ��� Ȯ�� ��û
	public void addProductPointConfirm(Product product) throws Exception;
	

	// �� �������� ���� ��ǰ �̹��� ���
	public void addProductCouponImg(Product product) throws Exception;
	// �� �������� ��ǰ�� ��ǰ �̹��� ���
	public void addProductVoucherImg(Product product) throws Exception;
	// �� �������� ����Ʈ ��ǰ �̹��� ���
	public void addProductPointImg(Product product) throws Exception;	
	
	
	
	// ��ǰ ���� Ȯ�� (���� ����_�����)
	public Product getProduct(int productNo) throws Exception;
	
	//���� ��ǰ �� ���� ���� ��û
	public Product getProductCoupon(int productNo) throws Exception;
	//��ǰ�� ��ǰ �� ���� ���� ��û
	public Product getProductVoucher(int productNo) throws Exception;
	//����Ʈ ��ǰ �� ���� ���� ��û
	public Product getProductPoint(int productNo) throws Exception;
	

	
	// ��ǰ���� ����Ʈ (���� ����_�����)
	public Map<String, Object> getProductList(Search search) throws Exception;
	
	// ���� ��ǰ ��ü ��� ��û
	public Product getProductCouponList() throws Exception;
	//��ǰ�� ��ǰ ��ü ��� ��û
	public Product getProductVoucherList() throws Exception;
	// ����Ʈ ��ǰ ��ü ��� ��û
	public Product getProductPointList() throws Exception;
	

	
	// ��ǰ���� ���� (���� ����_�����)
	public void updateProduct(Product product) throws Exception;
	

	//���� ��ǰ ���� �Ϸ� ��û
	public void updateProductCoupon(Product product) throws Exception;
	// ���� ��ǰ ���� �Ϸ� Ȯ�� ��û
	public void updateProductCouponConfirm(Product product) throws Exception;
	//��ǰ�� ��ǰ ���� �Ϸ� ��û
	public void updateProductVoucher(Product product) throws Exception;
	//��ǰ�� ��ǰ ���� �Ϸ� Ȯ��
	public void updateProductVoucherConfirm(Product product) throws Exception;
	//����Ʈ ��ǰ ���� �Ϸ� ��û
	public void updateProductPoint(Product product) throws Exception;
	//����Ʈ ��ǰ ���� �Ϸ� Ȯ��
	public void updateProductPointConfirm(Product product) throws Exception;
	
	
	// ���� ��ǰ �̹��� ����
	public void updateProductCouponImg(Product product) throws Exception;
	// ��ǰ�� ��ǰ �̹��� ���� ��û
	public void updateProductVoucherImg(Product product) throws Exception;
	// ����Ʈ ��ǰ �̹��� ����
	public void updateProductPointImg(Product product) throws Exception;	
	

	//���� ��ǰ ���� �Ϸ� ��û
	public void deleteProductCoupon(int productNo) throws Exception;
	//���� ��ǰ ���� Ȯ�� ��û
	public void deleteProductCouponConfirm(int productNo) throws Exception;
	//��ǰ�� ���� �Ϸ� ��û
	public void deleteProductVoucher(int productNo) throws Exception;
	//��ǰ�� ���� Ȯ�� ��û
	public void deleteProductVoucherConfirm(int productNo) throws Exception;
	//����Ʈ ���� �Ϸ� ��û
	public void deleteProductPoint(int productNo) throws Exception;
	//����Ʈ ���� Ȯ�� ��û
	public void deleteProductPointConfirm(int productNo) throws Exception;
	
	
	
	
	
	
	
	
	
	
	
}