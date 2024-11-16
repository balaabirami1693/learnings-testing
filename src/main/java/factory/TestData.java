package factory;

public class TestData {
    public static void main(String[] args) {
        Object data = DataProviderFactory.CreateTestData(DataSource.API);
        if (data != null) {
            System.out.println("Test Data:\n" + data);
        } else {
            System.out.println("No data retrieved.");
        }
    }
}
