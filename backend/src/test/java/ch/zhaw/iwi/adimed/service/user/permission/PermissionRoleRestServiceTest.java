package ch.zhaw.iwi.adimed.service.user.permission;

import ch.zhaw.iwi.adimed.model.user.permission.PermissionRole;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.user.permission.PermissionRoleRestService;

public class PermissionRoleRestServiceTest extends AbstractCrudRestServiceTest<PermissionRole, Long> {

	@Override
	protected Class<?> getService() {
		return PermissionRoleRestService.class;
	}

	@Override
	protected Class<PermissionRole> getEntityClass() {
		return PermissionRole.class;
	}

}
