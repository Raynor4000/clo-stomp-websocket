package us.neuner.clo.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
 * @author Jarod Neuner <jarod@neuner.us>
 * Describes card combinations for suggestions, accusations, and solutions.
 */
@JsonPropertyOrder({ "location", "suspect", "weapon" })
public class SuggestionInfo {

	private final GameEntityId location;
	private final GameEntityId suspect;
	private final GameEntityId weapon;
	
	/*
	 * Create a new @see SuggestionInfo object.
	 * @param location The location of the murder
	 * @param suspect The suspect who committed the murder
	 * @param weapon The weapon used in the murder
	 */
    @JsonCreator
	public SuggestionInfo(
			@JsonProperty("location") GameEntityId location, 
			@JsonProperty("suspect") GameEntityId suspect, 
			@JsonProperty("weapon") GameEntityId weapon) {
    	this.location = location;
    	this.suspect = suspect;
    	this.weapon = weapon;
	}

    /*
     * Returns the location of the murder
     * @return The @see GameEntityId of a weapon
     */
	public GameEntityId getLocation() {
		return this.location;
	}

	/*
	 * Returns the suspect who committed the murder
	 * @return The @see GameEntityId of a weapon
	 */
	public GameEntityId getSuspect() {
		return this.suspect;
	}

	/*
	 * Returns the weapon used in the murder
	 * @return The @see GameEntityId of a weapon
	 */
	public GameEntityId getWeapon() {
		return this.weapon;
	}

	/*
	 * Returns a hash code value for the object.
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((suspect == null) ? 0 : suspect.hashCode());
		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		return result;
	}

	/*
	 * Indicates whether some other object is "equal to" this one.
	 * @see java.lang.Object#equals()
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof SuggestionInfo) {
			SuggestionInfo other = (SuggestionInfo)obj;
			if (this.getLocation() != other.getLocation())
				return false;
			if (this.getSuspect() != other.getSuspect())
				return false;
			if (this.getWeapon() != other.getWeapon())
				return false;
			return true;
		}

		return false;
	}
}
