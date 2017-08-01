package version_01;

/**
 * The main Jigsaw Application
 * Manages the JigsawList
 * Implements Add and List
 * @author Gordon Branson
 * @version 1.0 January 2010
 *
 */
public class JigsawApp {
	/**
	 * The JigsawModel
	 */
	private JigsawModel jigsawModel;

	/**
	 * Default constructor
	 * Initialises the JigsawModel
	 */
	public JigsawApp() {
		jigsawModel = new JigsawModel();
	}
	
	/**
	 * The main run method.
	 * Allows the user to select an option,
	 * then calls the appropriate method.
	 */
	public void run(){
		int option;
		do{
			option = getOption();
			switch(option) {
			case 1 :
				addNewJigsaw();
				break;
			case 2 :
				listAllJigsaws();
				break;
			case 0 :
				break;
			default :
				System.out.println("Invalid menu option.");
			}
		}while (option != 0);
		System.out.println("Finished.");
	}
	
	/**
	 * Displays the menu of user options and
	 * gets users selection.
	 */
	private int getOption(){
		System.out.println();
		System.out.println("***********************");
		System.out.println("*     JIGSAW MENU     *");
		System.out.println("***********************");
		System.out.println("* 0. Quit             *");
		System.out.println("*                     *");
		System.out.println("* 1. Add a new Jigsaw *");
		System.out.println("* 2. List All Jigsaws *");
		System.out.println("***********************");
		System.out.println();
		return TextInputPrompt.getInt("Enter your selection.");
	}
	
	/**
	 * List all Jigsaws
	 * Gets a list of all Jigsaw puzzles and prints out to the console.
	 * Used only within the class.
	 */
	private void listAllJigsaws(){
		Jigsaw [] jigsaws = jigsawModel.getAllJigsaws();
		
		System.out.println("********************************");
		System.out.println(" All Jigsaws.");
		System.out.println("********************************");
		System.out.println();

		if(jigsaws.length == 0){
			System.out.println("No Jigsaws in List");
		}
		for(int i = 0; i < jigsaws.length; i++){
			System.out.print(i + " : ");
			System.out.println(jigsaws[i]);
		}
		TextInputPrompt.pause();
	}

	/**
	 * addNewJigsaw - gets the data for a new Jigsaw
	 * and adds it to the model
	 * Used only within the class
	 */
	private void addNewJigsaw(){
		String name;
		int pieces;
		double width, height;
		boolean missingPieces;
		
		name = TextInputPrompt.getString("Enter Jigsaw's name.");
		pieces = TextInputPrompt.getInt("Enter number of pieces.");
		width = TextInputPrompt.getDouble("Enter Jigsaw's width (in metres)");
		height = TextInputPrompt.getDouble("Enter Jigsaw's height (in metres)");
		missingPieces = TextInputPrompt.getBoolean("Are there any missing pieces? (true or false)");
		
		Jigsaw jigsaw = new Jigsaw(name,pieces,width,height,missingPieces);
		boolean check = jigsawModel.addJigsaw(jigsaw);
		if(check)
			System.out.println("Jigsaw added.");
		else
			System.out.println("List full - Jigsaw not added.");
		
		TextInputPrompt.pause();
	}
	
	/**
	 * The <b>main</b> method.
	 * Enables the application to run.
	 * @param args
	 */
	public static void main(String[] args) {
		JigsawApp theApp = new JigsawApp();
		theApp.run();

	}

}
