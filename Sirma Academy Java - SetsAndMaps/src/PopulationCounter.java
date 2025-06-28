import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("report")) {
            String[] tokens = line.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);

            if (!countries.containsKey(country)) {
                countries.put(country, new LinkedHashMap<String, Long>());
            }

            Map<String, Long> cities = countries.get(country);
            cities.put(city, population); // overwrite if exists

            line = scanner.nextLine();
        }

        List<String> countryNames = new ArrayList<>(countries.keySet());

        for (int i = 0; i < countryNames.size() - 1; i++) {
            for (int j = i + 1; j < countryNames.size(); j++) {
                long totalPopI = getTotalPopulation(countries.get(countryNames.get(i)));
                long totalPopJ = getTotalPopulation(countries.get(countryNames.get(j)));
                if (totalPopJ > totalPopI) {
                    String temp = countryNames.get(i);
                    countryNames.set(i, countryNames.get(j));
                    countryNames.set(j, temp);
                }
            }
        }

        for (int i = 0; i < countryNames.size(); i++) {
            String country = countryNames.get(i);
            Map<String, Long> cityMap = countries.get(country);
            long totalPopulation = getTotalPopulation(cityMap);

            System.out.println(country + " (total population: " + totalPopulation + ")");

            List<String> cityNames = new ArrayList<>(cityMap.keySet());
            for (int a = 0; a < cityNames.size() - 1; a++) {
                for (int b = a + 1; b < cityNames.size(); b++) {
                    long popA = cityMap.get(cityNames.get(a));
                    long popB = cityMap.get(cityNames.get(b));
                    if (popB > popA) {
                        String temp = cityNames.get(a);
                        cityNames.set(a, cityNames.get(b));
                        cityNames.set(b, temp);
                    }
                }
            }

            for (int j = 0; j < cityNames.size(); j++) {
                String city = cityNames.get(j);
                System.out.println("=>" + city + ": " + cityMap.get(city));
            }
        }
    }

    public static long getTotalPopulation(Map<String, Long> cityMap) {
        long total = 0;
        List<String> keys = new ArrayList<>(cityMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            total += cityMap.get(keys.get(i));
        }
        return total;
    }
}
