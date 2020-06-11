package ch.zhaw.iwi.adimed.service.file;

import ch.zhaw.iwi.adimed.model.file.File;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.file.FileRestService;

public class FileRestServiceTest extends AbstractCrudRestServiceTest<File, Long> {

	@Override
	protected Class<?> getService() {
		return FileRestService.class;
	}

	@Override
	protected Class<File> getEntityClass() {
		return File.class;
	}

}
