import java.io.*;

public class Greetings {
    public static void main(String[] args) throws IOException {
        String firstname, lastname;
        BufferedReader stdin =  new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Please enter your firstname: ");
        firstname = stdin.readLine();
        System.out.print("Please enter your last name: ");
        lastname = stdin.readLine();
        System.out.println("---------------------------");
        System.out.println("Hello " + firstname + " " + lastname);
        System.out.println("___________________________");
        System.out.println("what is your email address: ");
        String email = stdin.readLine();
        System.out.println(email);

    }
}
