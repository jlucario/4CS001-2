package version_01;

/**
 * The Model - a list of Jigsaw puzzles
 * Allows Adding and Listing of Jigsaw puzzles
 * @author Gordon Branson
 * @version 1.0 January 2010
 *
 */
public class JigsawModel {
	/**
	 * The Array of Jigsaw puzzles
	 */
	private Jigsaw [] jigsaws;
	
	/**
	 * The number of Jigsaw puzzles in the array
	 */
	private int numJigsaws;
	
	/**
	 * The maximum size of the array
	 */
	private final int MAXSIZE = 10;

	/**
	 * Default constructor - initialises the array
	 * and sets the number of jigsaws to 0
	 */
	public JigsawModel() {
		jigsaws = new Jigsaw[MAXSIZE];
		numJigsaws = 0;
	}

	/**
	 * Adds a new Jigsaw to the list if there is room.
	 * @param jigsaw the Jigsaw to add.
	 * @return success <b>true</b> if the Jigsaw was added.
	 */
	public boolean addJigsaw(Jigsaw jigsaw){
		if(numJigsaws == MAXSIZE)
			return false;
		jigsaws[numJigsaws] = jigsaw;
		numJigsaws++;
		return true;
	}
	
	/**
	 * Gets an array containing all the Jigsaws in the list.
	 * The array will be the size of the number of jigsaws.
	 * i.e. there will be no empty elements.
	 * @return the array of Jigsaws
	 */
	public Jigsaw[] getAllJigsaws(){
		Jigsaw[] list = new Jigsaw[numJigsaws];
		
		for(int i = 0; i < numJigsaws; i++)
			list[i] = jigsaws[i];
		
		return list;
	}
	
	

}
