package ch.zhaw.iwi.adimed.service.interactionelement.button;

import ch.zhaw.iwi.adimed.model.interactionelement.button.ButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.button.ButtonElementRestService;

public class ButtonElementRestServiceTest extends AbstractCrudRestServiceTest<ButtonElement, Long> {

	@Override
	protected Class<?> getService() {
		return ButtonElementRestService.class;
	}

	@Override
	protected Class<ButtonElement> getEntityClass() {
		return ButtonElement.class;
	}

}
