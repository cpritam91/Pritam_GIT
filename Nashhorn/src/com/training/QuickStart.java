package com.training;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class QuickStart {

	public static void main(String[] args) {
		
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");
		System.out.println(jsEngine.getFactory().getScriptEngine().toString());
		
		try {
			jsEngine.eval("print('Hello World!!')");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

}
