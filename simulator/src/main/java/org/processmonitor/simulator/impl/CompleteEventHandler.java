package org.processmonitor.simulator.impl;

import org.processmonitor.simulator.SimulationContext;
import org.processmonitor.simulator.SimulationEvent;
import org.processmonitor.simulator.SimulationEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompleteEventHandler implements SimulationEventHandler {

	private static Logger log = LoggerFactory.getLogger(CompleteEventHandler.class);
	
	@Override
	public void handle(SimulationEvent event, SimulationContext context) {
		String taskId = (String) event.getProperty("task");
		context.getTaskService().complete( taskId );
		log.debug( "completed taskId "+ taskId);
	}

	@Override
	public void init(SimulationContext context) {
		
	}

}
