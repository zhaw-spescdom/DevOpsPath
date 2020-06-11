package ch.zhaw.iwi.adimed.service.interactionelement.text;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.text.TextElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class TextElementRestService extends AbstractCrudRestService<TextElement, Long, TextElementDatabaseService> {

	@Inject
	public TextElementRestService(Injector injector) {
		super(injector, TextElementDatabaseService.class);
	}

}
