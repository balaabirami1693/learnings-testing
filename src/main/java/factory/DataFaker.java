package factory;

import com.github.javafaker.Faker;

public class DataFaker implements TestDataProvider {

    @Override
    public Object GetData() {
        Faker faker = new Faker();
        return faker.name().fullName(); // Returning a sample fake name
    }
}
