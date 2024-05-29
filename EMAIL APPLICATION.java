import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(10);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName + " " + lastName + ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";4
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get methods
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        public String getPassword() {
            return password;
        }
    
        public String getEmail() {
            return email;
        }
    
        @Override
        public String toString() {
            return "Name: " + firstName + " " + lastName +
                   "\nCompany Email: " + email +
                   "\nMailbox Capacity: " + mailboxCapacity + " MB";
        }
    }
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Create a new email account
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();
    
            Email newEmail = new Email(firstName, lastName);
    
            // Display initial account information
            System.out.println("\nAccount created:");
            System.out.println(newEmail);
    
            // Set mailbox capacity
            System.out.println("\nEnter new mailbox capacity (MB): ");
            int capacity = scanner.nextInt();
            newEmail.setMailboxCapacity(capacity);
    
            // Set alternate email
            scanner.nextLine();  // Consume the newline
            System.out.println("Enter alternate email: ");
            String altEmail = scanner.nextLine();
            newEmail.setAlternateEmail(altEmail);
    
            // Change password
            System.out.println("Enter new password: ");
            String newPassword = scanner.nextLine();
            newEmail.changePassword(newPassword);
    
            // Display updated account information
            System.out.println("\nUpdated account information:");
            System.out.println(newEmail);
    
            // Display alternate email and password
            System.out.println("\nAlternate Email: " + newEmail.getAlternateEmail());
            System.out.println("Password: " + newEmail.getPassword());
    
            scanner.close();
        }
    }
        
