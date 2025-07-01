import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] parts = line.split(" -> ");
            String company = parts[0];
            String id = parts[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<String>());
            }

            List<String> ids = companies.get(company);

            boolean exists = false;
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i).equals(id)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                ids.add(id);
            }

            line = scanner.nextLine();
        }

        List<String> companyNames = new ArrayList<>(companies.keySet());

        for (int i = 0; i < companyNames.size(); i++) {
            String company = companyNames.get(i);
            System.out.println(company);

            List<String> ids = companies.get(company);
            for (int j = 0; j < ids.size(); j++) {
                System.out.println("-- " + ids.get(j));
            }
        }
    }
}
