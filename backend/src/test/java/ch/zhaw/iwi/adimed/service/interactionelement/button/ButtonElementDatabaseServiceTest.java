package ch.zhaw.iwi.adimed.service.interactionelement.button;

import ch.zhaw.iwi.adimed.model.interactionelement.button.ButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.button.ButtonElementDatabaseService;

public class ButtonElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<ButtonElement, Long> {

	@Override
	protected Class<?> getService() {
		return ButtonElementDatabaseService.class;
	}

	@Override
	protected Class<ButtonElement> getEntity() {
		return ButtonElement.class;
	}
	

}