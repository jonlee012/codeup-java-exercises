public class ServerNameGenerator {

    public static void main(String[] args) {
        System.out.println("Your name is: ");
        System.out.println(adjective() + "-" + noun());

    }
    public static String getRandomString(String[] listOfStrings) {
        //goes through the array length to get a random object
        int index = (int) (Math.random() * (listOfStrings.length));
        return listOfStrings[index];
    }
    public static String noun() {
        String[] nouns = {"human", "dog", "cat", "bear", "horse", "pig", "spider", "bee", "walrus", "seal"};
        return getRandomString(nouns);
    }
    public static String adjective() {
        String[] adjective = {"fat", "skinny", "heavy", "strong", "beautiful", "cute", "ugly", "fit", "funny", "excited"};
        return getRandomString(adjective);
    }
}
