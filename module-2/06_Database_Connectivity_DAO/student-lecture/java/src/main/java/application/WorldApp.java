package application;

import com.techelevator.models.dto.City;
import com.techelevator.models.interfaces.CityDAO;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class WorldApp {
    CityDAO cityDao;

    public WorldApp(){
        BasicDataSource worldDataSource = new BasicDataSource();
        worldDataSource.setUrl("jbdc:postgres");
    }

    public void run

    {
        displayCities()
    }

    public void displayCities() {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine().toUpperCase();

        List<City> cities = cityDao.findCityByCountryCode(country);

        for (City city : cities);
    }
}
