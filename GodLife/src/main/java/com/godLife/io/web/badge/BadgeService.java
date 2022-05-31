package com.godLife.io.web.badge;


import java.util.Map;

import com.godLife.io.service.domain.Badges;
import com.godLife.io.service.domain.MyBadge;



public interface BadgeService {
	
	// 상품추가 (기존 내용_참고용)
	public void addProduct(Product product) throws Exception;
	
	// 신규 배지 등록 UI 요청
	public void addBadgeView(Badges badges) throws Exception;
	// 신규 배지 등록 완료 요청
	public void addBadge(Badges badges) throws Exception;
	// 신규 배지 등록 확인 요청
	public void addBadgeConfirm(Badges badges) throws Exception;

	// 상세 배지 이미지 등록
	public void addBadgeImg(Badges badges) throws Exception;

	

	// 상품 정보 확인 (기존 내용_참고용)
	public Product getProduct(int productNo) throws Exception;
	//배지 상세 정보 내용 요청
	public Badges getBadge(int bageNo) throws Exception;
	//배지 상세 정보 내용 요청
	public Badges getBadgeMy(int myBageNo) throws Exception;
	

	
	// 상품정보 리스트 (기존 내용_참고용)
	public Map<String, Object> getProductList(Search search) throws Exception;

	// 배지 전체 목록 요청
	public Badges getBadgeList(Badges bages) throws Exception;
	// 내 배지 전체 목록 요청
	public Badges getBadgeMyList(MyBadge myBadge) throws Exception;
	

	
	// 상품정보 수정 (기존 내용_참고용)
	public void updateProduct(Product product) throws Exception;
	

	// 배지 수정 완료 요청
	public void updateBadge(Badges badges) throws Exception;
	// 배지 수정 완료 확인 요청
	public void updateBadgeConfirm(Badges badges) throws Exception;

	

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