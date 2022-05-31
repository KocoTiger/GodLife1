package com.godLife.io.web.badge;


import java.util.Map;

import com.godLife.io.service.domain.Badges;
import com.godLife.io.service.domain.MyBadge;



public interface BadgeService {
	
	// ��ǰ�߰� (���� ����_�����)
	public void addProduct(Product product) throws Exception;
	
	// �ű� ���� ��� UI ��û
	public void addBadgeView(Badges badges) throws Exception;
	// �ű� ���� ��� �Ϸ� ��û
	public void addBadge(Badges badges) throws Exception;
	// �ű� ���� ��� Ȯ�� ��û
	public void addBadgeConfirm(Badges badges) throws Exception;

	// �� ���� �̹��� ���
	public void addBadgeImg(Badges badges) throws Exception;

	

	// ��ǰ ���� Ȯ�� (���� ����_�����)
	public Product getProduct(int productNo) throws Exception;
	//���� �� ���� ���� ��û
	public Badges getBadge(int bageNo) throws Exception;
	//���� �� ���� ���� ��û
	public Badges getBadgeMy(int myBageNo) throws Exception;
	

	
	// ��ǰ���� ����Ʈ (���� ����_�����)
	public Map<String, Object> getProductList(Search search) throws Exception;

	// ���� ��ü ��� ��û
	public Badges getBadgeList(Badges bages) throws Exception;
	// �� ���� ��ü ��� ��û
	public Badges getBadgeMyList(MyBadge myBadge) throws Exception;
	

	
	// ��ǰ���� ���� (���� ����_�����)
	public void updateProduct(Product product) throws Exception;
	

	// ���� ���� �Ϸ� ��û
	public void updateBadge(Badges badges) throws Exception;
	// ���� ���� �Ϸ� Ȯ�� ��û
	public void updateBadgeConfirm(Badges badges) throws Exception;

	

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