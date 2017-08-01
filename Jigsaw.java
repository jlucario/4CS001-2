package version_01;

/**
 * The main Jigsaw class - models a Jigsaw puzzle
 * @author Gordon Branson
 * @version 1.0 January 2010
 *
 */
public class Jigsaw {
	/**
	 * The name of the puzzle
	 */
	private String name;
	
	/**
	 * The number of pieces
	 */
	private int pieces;

	/**
	 * The width of the puzzle (in metres)
	 */
	private double width;

	/**
	 * The height of the puzzle (in metres)
	 */
	private double height;
	
	/**
	 * Declares if there are missing pieces
	 */
	private boolean missingPieces;

	/**
	 * Default Constructor
	 * Sets default values
	 */
	public Jigsaw() {
		this.name = "unknown";
		this.pieces = 0;
		this.width = 0.0;
		this.height = 0.0;
		this.missingPieces = true;
	}

	/**
	 * Parameterised constructor
	 * Sets specific values
	 * @param name
	 * @param pieces
	 * @param width
	 * @param height
	 * @param missingPieces
	 */
	public Jigsaw(String name, int pieces, double width, double height,
			boolean missingPieces) {
		this.name = name;
		this.pieces = pieces;
		this.width = width;
		this.height = height;
		this.missingPieces = missingPieces;
	}

	/**
	 * Gets the Jigsaw name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Jigsaw name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the number of pieces
	 * @return the pieces
	 */
	public int getPieces() {
		return pieces;
	}

	/**
	 * Sets the number of pieces
	 * @param pieces the pieces to set
	 */
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	/**
	 * Gets the Jigsaw width in metres
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Sets the Jigsaw width in metres
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Gets the Jigsaw height in metres
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the Jigsaw height in metres
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Gets if any pieces are missing
	 * @return <b>true</b> if any pieces missing
	 */
	public boolean isMissingPieces() {
		return missingPieces;
	}

	/**
	 * Sets if any pieces are missing
	 * @param missingPieces <b>true</b> if any pieces missing
	 */
	public void setMissingPieces(boolean missingPieces) {
		this.missingPieces = missingPieces;
	}

	/** 
	 * Overrides the Object.toString method
	 * @return a String representation of the object
	 */
	public String toString() {
		return "Jigsaw name=" + name +
		", pieces="+ pieces +
		", width=" + width +
		", height=" + height +
		", missing pieces=" + missingPieces;
	}
	
	
}
