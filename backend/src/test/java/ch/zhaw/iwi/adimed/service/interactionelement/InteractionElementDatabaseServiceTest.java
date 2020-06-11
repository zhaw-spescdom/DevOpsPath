package ch.zhaw.iwi.adimed.service.interactionelement;

import ch.zhaw.iwi.adimed.model.interactionelement.InteractionElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.InteractionElementDatabaseService;

@SuppressWarnings("rawtypes")
public class InteractionElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<InteractionElement, Long> {

	@Override
	protected Class<?> getService() {
		return InteractionElementDatabaseService.class;
	}

	@Override
	protected Class<InteractionElement> getEntity() {
		return InteractionElement.class;
	}
	

}