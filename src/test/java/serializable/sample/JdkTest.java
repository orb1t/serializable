package serializable.sample;

import java.io.IOException;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

public class JdkTest extends BaseTest {

	@Test
	public void jdk() throws IOException {
		byte[] data = SerializationUtils.serialize(user);
		User obj = SerializationUtils.deserialize(data);
		print(obj);
	}
}