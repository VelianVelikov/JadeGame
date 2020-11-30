import java.util.Vector;

public class Map {
	/**
	 * Field which stores the town that the map is set in.
	 */
	private String _town;
	/**
	 *  
	 *     
	 * Field which stores the city that the map is set in
	 */
	private String _city;
	/**
	 *  
	 *     
	 * Field which stores the country that the map is set in.
	 */
	private String _country;
	private String _gameDesigner;
	/**
	 *  
	 *     
	 * Field which stores the selected location that the player wants to travel to. Would be used as a parameter in the GetPathway Method and used to highlight on the in game map.
	 */
	private int _selectedLocation;
	public Game _loads;
	public Vector<Location> _contains = new Vector<Location>();

	/**
	 *  
	 *     
	 * Method which gets the pathway from one location to another
	 */
	public void getPathway() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Method which checks whether a player is in the boundaries of a location
	 */
	public void playerMovement() {
		throw new UnsupportedOperationException();
	}
}