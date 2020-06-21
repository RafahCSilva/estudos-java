package rcs.rafahcsilva.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsMain {
    public static void main(String[] args) {

        // Nashorn Javascript engine - EVAL for JAVASCRIPT ES5
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        try {
            nashorn.eval("print('Hello World from nashorn');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
