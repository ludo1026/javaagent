package javaagent.monitoring;

import java.lang.instrument.Instrumentation;

public class AgentMonitor {
	
	/**
	 * Instrumentation.
	 * @param agentArgs arguments
	 * @param inst instrumentation
	 */
	public static void premain(String agentArgs, Instrumentation inst) {
		System.out.println("agentArgs : " + agentArgs );
		System.out.println("All loaded classes :");
		for(Class clazz : inst.getAllLoadedClasses()) {
			System.out.println("- "+clazz.getName());
		}
		System.out.println("Initiated classes :");
		for(Class clazz : inst.getInitiatedClasses(null)) {
			System.out.println("- "+clazz.getName());
		}
	}
	
	/**
	 * Instrumentation.
	 * @param agentArgs arguments
	 * @param inst instrumentation
	 */
	public static void agentmain(String agentArgs, Instrumentation inst) {
		premain(agentArgs, inst);
	}
	
}
