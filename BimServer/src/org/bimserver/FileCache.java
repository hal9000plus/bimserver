package org.bimserver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.bimserver.emf.EmfSerializer;
import org.bimserver.shared.CheckoutResult;
import org.bimserver.shared.ResultType;

public class FileCache {
	private File cacheDir = new File("cache");

	public void store(int pid, int rid, ResultType resultType, CheckoutResult checkoutResult) {
		try {
			String fileName = pid + "." + rid + "." + resultType.getDefaultExtension();
			File file = new File(cacheDir, fileName);
			EmfSerializer emfSerializer = (EmfSerializer)checkoutResult.getFile().getDataSource();
			emfSerializer.write(new FileOutputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CheckoutResult get(int pid, int rid, ResultType resultType) {
		String fileName = pid + "." + rid + "." + resultType.getDefaultExtension();
		File file = new File(cacheDir, fileName);
		CheckoutResult checkoutResult = new CheckoutResult();
		checkoutResult.setProjectName("" + pid);
		checkoutResult.setRevisionNr(rid);
		checkoutResult.setFile(new DataHandler(new FileDataSource(file)));
		return checkoutResult;
	}

	public boolean contains(int pid, int rid, ResultType resultType) {
		String fileName = pid + "." + rid + "." + resultType.getDefaultExtension();
		File file = new File(cacheDir, fileName);
		return file.exists() && file.isFile();
	}
}