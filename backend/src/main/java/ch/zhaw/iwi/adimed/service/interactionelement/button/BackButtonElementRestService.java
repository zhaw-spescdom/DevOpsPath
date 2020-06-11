package ch.zhaw.iwi.adimed.service.interactionelement.button;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.button.BackButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class BackButtonElementRestService extends AbstractCrudRestService<BackButtonElement, Long, BackButtonElementDatabaseService> {

	@Inject
	public BackButtonElementRestService(Injector injector) {
		super(injector, BackButtonElementDatabaseService.class);
	}

}
