public class TriangleSolver {
	
	public String solveTriangle(Triangle t)
	{
		// If all sides are equal, return "Equilateral"
		if (areEqual(t.getA(), t.getB()) && areEqual(t.getB(), t.getC())) 
		{
			return "Equilateral";
		}																 		
		// If two of the three sides are equal, return "Isosceles"
		if (
			(areEqual(t.getA(), t.getB()) || areEqual(t.getB(), t.getC()) || areEqual(t.getA(), t.getC()))
			
	
		)
		{
			return "Isosceles";
		}
		// If no sides are equal, return "Scalene"
		if (!areEqual(t.getA(), t.getB()) && !areEqual(t.getB(), t.getC()) && !areEqual(t.getA(), t.getC())) 
		{
			return "Scalene";
		}		
		return "";
	}
	// Compares a and b for equality, returns true if they are equal and returns false if they are not
	public boolean areEqual(float a, float b)
	{
		return a == b;		
	}
}
