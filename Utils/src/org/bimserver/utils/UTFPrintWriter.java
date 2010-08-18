package org.bimserver.utils;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UTFPrintWriter extends PrintWriter {

	public UTFPrintWriter(OutputStream out) throws UnsupportedEncodingException {
		super(new PrintWriter(new OutputStreamWriter(out, "UTF-8")), false);
	}
}