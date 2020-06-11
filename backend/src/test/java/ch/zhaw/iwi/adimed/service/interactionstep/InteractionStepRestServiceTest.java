package ch.zhaw.iwi.adimed.service.interactionstep;

import ch.zhaw.iwi.adimed.model.interactionstep.InteractionStep;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionstep.InteractionStepRestService;

public class InteractionStepRestServiceTest extends AbstractCrudRestServiceTest<InteractionStep, Long> {

	@Override
	protected Class<?> getService() {
		return InteractionStepRestService.class;
	}

	@Override
	protected Class<InteractionStep> getEntityClass() {
		return InteractionStep.class;
	}

}
