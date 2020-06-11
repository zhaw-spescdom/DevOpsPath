package ch.zhaw.iwi.adimed.service.file;

import ch.zhaw.iwi.adimed.model.file.File;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.file.FileDatabaseService;

public class FileDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<File, Long> {

	@Override
	protected Class<?> getService() {
		return FileDatabaseService.class;
	}

	@Override
	protected Class<File> getEntity() {
		return File.class;
	}
	

}