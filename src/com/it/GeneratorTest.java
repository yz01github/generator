package com.it;

import javax.annotation.Resource;

import com.it.bean.AaaExample;
import com.it.ssm.mapper.AaaMapper;

public class GeneratorTest {
	
	@Resource
	private static AaaMapper aaaMapper;
	
	public static void main(String[] args) {
		String property = System.getProperty("user.dir");
		System.out.println(property+aaaMapper);
		int i = aaaMapper.countByExample(new AaaExample());
		System.out.println(i);
	}
}
