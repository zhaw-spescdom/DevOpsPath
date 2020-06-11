package ch.zhaw.iwi.adimed.service.interactionelement.button;

import ch.zhaw.iwi.adimed.model.interactionelement.button.BackButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.button.BackButtonElementDatabaseService;

public class BackButtonElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<BackButtonElement, Long> {

	@Override
	protected Class<?> getService() {
		return BackButtonElementDatabaseService.class;
	}

	@Override
	protected Class<BackButtonElement> getEntity() {
		return BackButtonElement.class;
	}
	

}