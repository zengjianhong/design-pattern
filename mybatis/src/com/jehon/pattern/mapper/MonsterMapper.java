package com.jehon.pattern.mapper;

import java.util.List;
import java.util.Map;

import com.jehon.pattern.entity.Monster;
import org.apache.ibatis.annotations.Param;

interface MonsterMapper {

	//添加方法
	void addMonster(Monster monster);
	
	//根据id删除一个Monster
	void	delMonster(Integer monster_id);
	
	//修改Monster
	void updateMonster(Monster monster);
	//查询-根据id
	Monster getMonsterById(Integer monster_id);
	//查询所有的Monster
	List<Monster> findAllMonster();
	
	//通过id 或者名字查询
	List<Monster> findMonsterByNameORId(Monster monster);
	
	//查询名字中含义'牛魔王'妖怪
	List<Monster> findMonsterByName(String name);
	
	//查询 id > 10 并且 salary 大于 40, 要求传入的参数是HashMap
	List<Monster> 
		findMonsterByIdAndSalary_PrameterHashMap(Map<String,Object> map);
	
	//查询 id > 10 并且 salary 大于 40, 要求传入的参数是HashMap
	List<Map<String,Object>> 
		findMonsterByIdAndSalary_PrameterHashMap_ReturnHashMap(Map<String,Object> map);
	
	//根据age查询结果
	List<Monster> findMonsterByAge(@Param("age") Integer age);
	
	//根据id和名字来查询结果
	List<Monster> findMonsterByIdAndName(Monster monster);
	
	
}
