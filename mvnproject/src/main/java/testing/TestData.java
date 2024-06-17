package testing;
import org.testng.annotations.DataProvider;
public class TestData {
	@DataProvider(name = "productData")
	public Object[][] productData() {
		return new Object[][] {
			{"Jacket"},
		};
	}
	}
	
	
	


