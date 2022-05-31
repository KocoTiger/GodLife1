package com.godLife.io.web.badge;

import java.util.List;

import com.godLife.io.service.domain.Badges;




public interface BadgeDao {
	
	// INSERT (���� ����_�����)
	public void addBadge(Badges badges) throws Exception ;

	// SELECT ONE (���� ����_�����)
	public Badges getBadge(int badgeNo) throws Exception ;

	// SELECT LIST (���� ����_�����)
	public List<Badges> getBadgeList(Search search) throws Exception ;

	// UPDATE (���� ����_�����)
	public void updateBadge(Badges badges) throws Exception ;

	// DELETE (�ݹ� �߰�)
	public void deleteBadge() throws Exception ;
	
	
}