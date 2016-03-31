package com.training;

import java.io.FileReader;
import java.io.IOException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InvokeJavaScript {

	public static void main(String[] args) {
		try {
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");

			//jsEngine.eval(new FileReader("MyScript.js"));
			
			jsEngine.eval(new FileReader("ClassFromJS.js"));
			
			Invocable invocable =(Invocable) jsEngine;
			
			//Object result = invocable.invokeFunction("fun1", "Pritam Chakraborty");
			
			Object result = invocable.invokeFunction("result");
			
			System.out.println(result);
		} catch (IOException | ScriptException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		
	}

}
