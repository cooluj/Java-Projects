
public class Type {

	// instance data
	// super effectives 
	Type[] superEffective;
	// not very effective
	Type[] notVeryEffective;
	
	// constructor to initialize our data
	public Type(Type[] superEffective, Type[] notVeryEffective) {
		
		// Class invariant
		this.superEffective = superEffective;
		this.notVeryEffective = notVeryEffective;
	}
	
	//getters
	public Type[] getSuperEffective() {
		return superEffective;
	}
	
	public Type[] getNotVeryEffective() {
		return notVeryEffective;
	}
	
	// other methods
	// is this type Super Effective against the passed in type
	public boolean isSuperEffective(Type other) {
		// traverse our superEffective array
		// if the other type is contained, return true; otherwise false.
		return false;
	}
	// is this type Not Very Effective against the passed in type
	
}
