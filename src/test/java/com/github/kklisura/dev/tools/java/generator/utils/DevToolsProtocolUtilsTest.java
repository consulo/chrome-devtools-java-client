package com.github.kklisura.dev.tools.java.generator.utils;

import com.github.kklisura.dev.tools.java.generator.protocol.DevToolsProtocol;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * DevToolsProtocolUtils test.
 *
 * @author Kenan Klisura
 */
public class DevToolsProtocolUtilsTest {
	public static final String PROTOCOL_FIXTURE = "protocol.json";

	@Test
	public void testSerializationDeserialization() throws IOException, JSONException {
		String json = readString(getFixture(PROTOCOL_FIXTURE));

		DevToolsProtocol protocol = DevToolsProtocolUtils.readJson(getFixture(PROTOCOL_FIXTURE));
		String output = DevToolsProtocolUtils.writeJson(protocol);

		JSONAssert.assertEquals(json, output, true);
	}

	private static InputStream getFixture(String resource) {
		return DevToolsProtocolUtilsTest.class.getClassLoader().getResourceAsStream(resource);
	}

	private static String readString(InputStream inputStream) throws IOException {
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		int result = inputStream.read();
		while(result != -1) {
			buf.write((byte) result);
			result = inputStream.read();
		}

		return buf.toString("UTF-8");
	}
}