package ch.zhaw.iwi.adimed.service.interactionelement.button;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.button.ButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class ButtonElementRestService extends AbstractCrudRestService<ButtonElement, Long, ButtonElementDatabaseService> {

	@Inject
	public ButtonElementRestService(Injector injector) {
		super(injector, ButtonElementDatabaseService.class);
	}

}
