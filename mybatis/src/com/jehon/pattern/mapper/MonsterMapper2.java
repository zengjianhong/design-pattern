package com.jehon.pattern.mapper;

import java.util.List;

import com.jehon.pattern.entity.Monster2;


public interface MonsterMapper2 {

	//添加方法
	void addMonster(Monster2 monster);
	
	//查询所有的Monster
	List<Monster2> findAllMonster();
}
