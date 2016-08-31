package com.importsource.itest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hezf
 *
 */
public class Assert {
	public static List<Result> results=new ArrayList<Result>();

	public synchronized static void assertTrue(boolean b) {
		if(b){
			Result result=new Result();
			result.setCode("ok");
			results.add(result);
		}else{
			Result result=new Result();
			result.setCode("fail");
			results.add(result);
		}
		
	}
   
}
