//package contacts;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    private static Scanner scanner = new Scanner(System.in);
//    // Creating an instant with a default Number
//    private static MobilePhone mobilePhone = new MobilePhone("000 443 876");
//
//    public static void main(String[] args) throws IOException {
//        //        create directory & file
//        String directory = "contacts";
//        String filename = "NewContacts.txt";
//
//        Path myDirectory = Paths.get(directory);
//        Path myFile = Paths.get(directory, filename);
////        System.out.println(myDirectory);
////        System.out.println(myFile);
//
//        if (Files.notExists(myDirectory)) {
//            Files.createDirectories(myDirectory);
//        }
//
//        if (!Files.exists(myFile)) {
//            Files.createFile(myFile);
//        }
//
//        writeToFile();
//        readFileContents();
//
////        String file = "Contacts.txt";
////
////        Scanner scan = new Scanner(System.in);
////
////        FileWriter fw = new FileWriter(file);
////        while(true){
////            String input = scan.nextLine();
////            if("DONE".equalsIgnoreCase(input.trim())){
////                break;
////            }
////            fw.write(input);
////        }
////        scan.close();
////        fw.close();
//
//
//        boolean quite = false;
//        startPhone();
//        printAction();
//        while (!quite) {
//            System.out.println("Enter an option (1, 2, 3, 4 or 5)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//
//                case 2:
//                    addNewContact();
//                    break;
//
//                case 3:
//                    queryContact();
//                    break;
//
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    System.out.println("Exit");
//                    quite = true;
//                    break;
//
//            }
//
//        }
//    }
//
//        public static void writeToFile() throws IOException{
//            Path filepath = Paths.get("contacts", "NewContacts.txt");
////        System.out.println(filepath);
//
//            List<String> countries = Arrays.asList(mobilePhone.this.myContacts);
//
////        String title = "These are countries:";
//
//            Files.write(filepath, countries, StandardOpenOption.APPEND);
////        System.out.println(Files.readAllLines(filepath));
//
////        List<String> fileContents = Files.readAllLines(filepath);
////        System.out.println(fileContents);
//
//        }
//
//        public static void readFileContents() throws IOException {
//            Path filepath = Paths.get("contacts", "NewContacts.txt");
//            List<String> fileContents = Files.readAllLines(filepath);
//            System.out.println(fileContents);
//        }
//
//
//    private static void addNewContact() {
//        System.out.println("Enter new contact name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter contact's phone Number: ");
//        String phone = scanner.nextLine();
//        String number = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
//        Contacts newContact = Contacts.createContact(name, number);
//        if(mobilePhone.addNewContact(newContact)) {
//            System.out.println("New Contact Added: "+ name + " | " + number);
//        }else {
//            System.out.println("Can't add, " + name +" already on file");
//        }
//    }
//    //    private static void updateContact() {
////        System.out.println("Enter an existing contact name : ");
////        String name = scanner.nextLine();
////        Contacts extContact = mobilePhone.queryContact(name);
////        if(extContact == null)
////        {
////            System.out.println("Cannot found contact");
////            return;
////        }
////
////        System.out.println("Enter new contact name: ");
////        String newName = scanner.nextLine();
////        System.out.println("Enter new Phone Number: ");
////        String newNumber = scanner.nextLine();
////        String newNum = newNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
////
////        Contacts newContact = Contacts.createContact(newName, newNum);
////        if(mobilePhone.updateContact(extContact, newContact))
////        {
////            System.out.println("Contact successfully updated");
////        }else {
////            System.out.println("There was an error updating contact");
////        }
////    }
//    private static void removeContact() {
//        System.out.println("Enter existing contact name : ");
//        String name = scanner.nextLine();
//        Contacts extContact = mobilePhone.queryContact(name);
//        if(extContact == null)
//        {
//            System.out.println("Cannot find contact");
//            return;
//        }
//
//        if(mobilePhone.removeContact(extContact)) {
//            System.out.println("Contact successfully deleted");
//        }else {
//            System.out.println("There was an error deleting the contact");
//        }
//    }
//    private static void queryContact() {
//        System.out.println("Enter an existing contact name : ");
//        String name = scanner.nextLine();
//        Contacts extContact = mobilePhone.queryContact(name);
//        if(extContact == null)
//        {
//            System.out.println("Contact does not exist");
//            return;
//        }
//
//        System.out.println("Name : " + extContact.getName() +
//                " Phone Number is: " + extContact.getPhoneNumber());
//    }
//
//
//    private static void startPhone() {
//        System.out.println("Starting Phone . . .");
//    }
//    private static void printAction() {
//        System.out.println("\nSelect from the available options: ");
//        System.out.println(
//                "1. View Contacts\n"+
//                        "2. Add a new contact\n"+
//                        "3. Search a contact by name\n"+
//                        "4. Delete an existing contact.\n"+
//                        "5. Exit\n");
//        System.out.println("Choose Your Action: ");
//    }
//
//}