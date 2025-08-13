package com.example.demo.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodDao {

	@Select("""
			SELECT
			  food_name
			FROM
			  food
			WHERE
			  category_name = #{searchWord};
			""")
	public ArrayList<String> selectFoodName(String searchWord);

}
