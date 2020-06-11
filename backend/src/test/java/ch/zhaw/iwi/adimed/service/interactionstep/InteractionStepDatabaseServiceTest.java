package ch.zhaw.iwi.adimed.service.interactionstep;

import ch.zhaw.iwi.adimed.model.interactionstep.InteractionStep;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionstep.InteractionStepDatabaseService;

public class InteractionStepDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<InteractionStep, Long> {

	@Override
	protected Class<?> getService() {
		return InteractionStepDatabaseService.class;
	}

	@Override
	protected Class<InteractionStep> getEntity() {
		return InteractionStep.class;
	}
	

}