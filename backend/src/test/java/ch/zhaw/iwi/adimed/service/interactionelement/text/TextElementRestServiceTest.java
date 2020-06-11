package ch.zhaw.iwi.adimed.service.interactionelement.text;

import ch.zhaw.iwi.adimed.model.interactionelement.text.TextElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.text.TextElementRestService;

public class TextElementRestServiceTest extends AbstractCrudRestServiceTest<TextElement, Long> {

	@Override
	protected Class<?> getService() {
		return TextElementRestService.class;
	}

	@Override
	protected Class<TextElement> getEntityClass() {
		return TextElement.class;
	}

}
