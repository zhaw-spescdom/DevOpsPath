package ch.zhaw.iwi.adimed.service.interactionelement;

import ch.zhaw.iwi.adimed.model.interactionelement.InteractionElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.InteractionElementRestService;

@SuppressWarnings("rawtypes")
public class InteractionElementRestServiceTest extends AbstractCrudRestServiceTest<InteractionElement, Long> {

	@Override
	protected Class<?> getService() {
		return InteractionElementRestService.class;
	}

	@Override
	protected Class<InteractionElement> getEntityClass() {
		return InteractionElement.class;
	}

}
