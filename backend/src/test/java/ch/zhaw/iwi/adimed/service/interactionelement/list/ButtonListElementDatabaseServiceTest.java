package ch.zhaw.iwi.adimed.service.interactionelement.list;

import ch.zhaw.iwi.adimed.model.interactionelement.list.ButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.list.ButtonListElementDatabaseService;

public class ButtonListElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<ButtonListElement, Long> {

	@Override
	protected Class<?> getService() {
		return ButtonListElementDatabaseService.class;
	}

	@Override
	protected Class<ButtonListElement> getEntity() {
		return ButtonListElement.class;
	}
	

}