public class CmdLine {

	public static void main(String [] args) {
		System.out.printf("You entered %d arguments.\n",
		   args.length);

		for (String argument: args) {
			System.out.println(argument);
		}
  }
}
