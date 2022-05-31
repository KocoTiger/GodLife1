package com.godLife.io.web.badge;

import java.util.List;

import com.godLife.io.service.domain.Badges;




public interface BadgeDao {
	
	// INSERT (기존 내용_참고용)
	public void addBadge(Badges badges) throws Exception ;

	// SELECT ONE (기존 내용_참고용)
	public Badges getBadge(int badgeNo) throws Exception ;

	// SELECT LIST (기존 내용_참고용)
	public List<Badges> getBadgeList(Search search) throws Exception ;

	// UPDATE (기존 내용_참고용)
	public void updateBadge(Badges badges) throws Exception ;

	// DELETE (금번 추가)
	public void deleteBadge() throws Exception ;
	
	
}