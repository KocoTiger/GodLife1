package com.godLife.io.web.product;


import java.util.Map;

import com.godLife.io.service.domain.Product;



public interface ProductService {
	
	// 상품추가 (기존 내용_참고용)
	public void addProduct(Product product) throws Exception;
	
	// 신규 상품권 상품 등록 UI 요청
	public void addProductCouponView(Product product) throws Exception;	
	// 신규 상품권 상품 등록 UI 요청
	public void addProductVoucherView(Product product) throws Exception;
	// 신규 상품권 상품 등록 UI 요청
	public void addProductPointView(Product product) throws Exception;	
	
	
	// 신규 쿠폰 상품 등록 완료 완료 요청
	public void addProductCoupon(Product product) throws Exception;
	// 신규 쿠폰 상품 등록 확인 요청
	public void addProductCouponConfirm(Product product) throws Exception;
	//신규 상품권 상품 등록 완료 요청
	public void addProductVoucher(Product product) throws Exception;
	//신규 상품권 상품 등록 확인 요청
	public void addProductVoucherConfirm(Product product) throws Exception;
	// 신규 포인트 상품 등록 완료 확인 요청
	public void addProductPoint(Product product) throws Exception;
	//신규 포인트 상품 등록 확인 요청
	public void addProductPointConfirm(Product product) throws Exception;
	

	// 상세 정보에서 쿠폰 상품 이미지 등록
	public void addProductCouponImg(Product product) throws Exception;
	// 상세 정보에서 상품권 상품 이미지 등록
	public void addProductVoucherImg(Product product) throws Exception;
	// 상세 정보에서 포인트 상품 이미지 등록
	public void addProductPointImg(Product product) throws Exception;	
	
	
	
	// 상품 정보 확인 (기존 내용_참고용)
	public Product getProduct(int productNo) throws Exception;
	
	//쿠폰 상품 상세 정보 내용 요청
	public Product getProductCoupon(int productNo) throws Exception;
	//상품권 상품 상세 정보 내용 요청
	public Product getProductVoucher(int productNo) throws Exception;
	//포인트 상품 상세 정보 내용 요청
	public Product getProductPoint(int productNo) throws Exception;
	

	
	// 상품정보 리스트 (기존 내용_참고용)
	public Map<String, Object> getProductList(Search search) throws Exception;
	
	// 쿠폰 상품 전체 목록 요청
	public Product getProductCouponList() throws Exception;
	//상품권 상품 전체 목록 요청
	public Product getProductVoucherList() throws Exception;
	// 포인트 상품 전체 목록 요청
	public Product getProductPointList() throws Exception;
	

	
	// 상품정보 수정 (기존 내용_참고용)
	public void updateProduct(Product product) throws Exception;
	

	//쿠폰 상품 수정 완료 요청
	public void updateProductCoupon(Product product) throws Exception;
	// 쿠폰 상품 수정 완료 확인 요청
	public void updateProductCouponConfirm(Product product) throws Exception;
	//상품권 상품 수정 완료 요청
	public void updateProductVoucher(Product product) throws Exception;
	//상품권 상품 수정 완료 확인
	public void updateProductVoucherConfirm(Product product) throws Exception;
	//포인트 상품 수정 완료 요청
	public void updateProductPoint(Product product) throws Exception;
	//포인트 상품 수정 완료 확인
	public void updateProductPointConfirm(Product product) throws Exception;
	
	
	// 쿠폰 상품 이미지 수정
	public void updateProductCouponImg(Product product) throws Exception;
	// 상품권 상품 이미지 수정 요청
	public void updateProductVoucherImg(Product product) throws Exception;
	// 포인트 상품 이미지 수정
	public void updateProductPointImg(Product product) throws Exception;	
	

	//쿠폰 상품 삭제 완료 요청
	public void deleteProductCoupon(int productNo) throws Exception;
	//쿠폰 상품 삭제 확인 요청
	public void deleteProductCouponConfirm(int productNo) throws Exception;
	//상품권 삭제 완료 요청
	public void deleteProductVoucher(int productNo) throws Exception;
	//상품권 삭제 확인 요청
	public void deleteProductVoucherConfirm(int productNo) throws Exception;
	//포인트 삭제 완료 요청
	public void deleteProductPoint(int productNo) throws Exception;
	//포인트 삭제 확인 요청
	public void deleteProductPointConfirm(int productNo) throws Exception;
	
	
	
	
	
	
	
	
	
	
	
}