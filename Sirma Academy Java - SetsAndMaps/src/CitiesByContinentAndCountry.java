import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> data = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String continent = parts[0];
            String country = parts[1];
            String city = parts[2];

            if (!data.containsKey(continent)) {
                data.put(continent, new LinkedHashMap<String, List<String>>());
            }

            Map<String, List<String>> countries = data.get(continent);

            if (!countries.containsKey(country)) {
                countries.put(country, new ArrayList<String>());
            }

            countries.get(country).add(city);
        }

        List<String> continentList = new ArrayList<>(data.keySet());

        for (int i = 0; i < continentList.size(); i++) {
            String continent = continentList.get(i);
            System.out.println(continent + ":");

            Map<String, List<String>> countries = data.get(continent);
            List<String> countryList = new ArrayList<>(countries.keySet());

            for (int j = 0; j < countryList.size(); j++) {
                String country = countryList.get(j);
                List<String> cities = countries.get(country);

                String line = "  " + country + " -> ";
                for (int k = 0; k < cities.size(); k++) {
                    line += cities.get(k);
                    if (k < cities.size() - 1) {
                        line += ", ";
                    }
                }

                System.out.println(line);
            }
        }
    }
}
