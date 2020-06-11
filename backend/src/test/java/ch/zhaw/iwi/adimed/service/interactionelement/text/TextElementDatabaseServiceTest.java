package ch.zhaw.iwi.adimed.service.interactionelement.text;

import ch.zhaw.iwi.adimed.model.interactionelement.text.TextElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.text.TextElementDatabaseService;

public class TextElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<TextElement, Long> {

	@Override
	protected Class<?> getService() {
		return TextElementDatabaseService.class;
	}

	@Override
	protected Class<TextElement> getEntity() {
		return TextElement.class;
	}
	

}