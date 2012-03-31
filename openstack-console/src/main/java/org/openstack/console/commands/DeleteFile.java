package org.openstack.console.commands;

import org.kohsuke.args4j.Argument;
import org.openstack.api.storage.AccountResource;
import org.openstack.console.model.StoragePath;

public class DeleteFile extends OpenstackCliCommandRunnerBase {
	@Argument(index = 0)
	public StoragePath path;

	public DeleteFile() {
		super("delete", "file");
	}

	@Override
	public Object runCommand() throws Exception {
		AccountResource client = getStorageClient();

		path.getResource(client).delete();

		return path.getKey();
	}

}