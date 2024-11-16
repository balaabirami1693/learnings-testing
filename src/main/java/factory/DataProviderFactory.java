package factory;

public class DataProviderFactory {
    public static Object CreateTestData(DataSource data) {
        switch (data) {
            case Excel:
                return new ExcelReader().GetData();
            case Faker:
                return new DataFaker().GetData();
            case DB:
                return new DatabaseReader().GetData();
            case API:
                return new ApiReader().GetData();
            default:
                return null;
        }
    }
}

