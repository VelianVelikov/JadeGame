public abstract class Location {
	private FilePath _icon;
	private Array[] _boundaryCoordinates;
	private String _locationName;
	private String _locationDescription;
	private String _hint;
	private int _costOfHint;
	private int _locationId;
	private int _locationSetting;
	public Map _contains;

	public abstract void displayIcon();

	public abstract void getBoundaryCoordinates();

	public abstract void displayLocationName();

	public abstract void displayLocationDescription();

	public abstract void displayHit();

	public void getLocationId() {
		throw new UnsupportedOperationException();
	}

	public void getLocationSetting() {
		throw new UnsupportedOperationException();
	}
}