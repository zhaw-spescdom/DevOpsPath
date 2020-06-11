package ch.zhaw.iwi.adimed.service.interactionelement.button;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.button.ButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class ButtonSelectionElementValueRestService extends AbstractCrudRestService<ButtonElement, Long, ButtonSelectionElementValueDatabaseService> {

	@Inject
	public ButtonSelectionElementValueRestService(Injector injector) {
		super(injector, ButtonSelectionElementValueDatabaseService.class);
	}

}
