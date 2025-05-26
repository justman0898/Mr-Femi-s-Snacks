import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestScores{
	@Test
	public void testThattotalOfArrayExists(){
		int[][] scores = {{3,3,4},{9,1,3}};
		SortedSquareFunction.totalOfArray(scores);

	}
	@Test
	public void testTotalOfArray(){
		int[][] scores = { {3,3,4} , {9,1,3} };
		int[] expected = {10,13};
		assertArrayEquals(expected, SortedSquareFunction.totalOfArray(scores));
	}
	@Test 
	public void testThatAverageOfArrayExists(){
		int[][] scores = { {3,3,4} , {9,1,3} };
		SortedSquareFunction.averageOfArray(scores);
	}
	@Test
	public void testAverageFunction(){
		int[][] scores = { {3,3,4} , {9,1,3} };
		double[] expected = {3.33, 4.33};
		assertArrayEquals(expected, SortedSquareFunction.averageOfArray(scores));
	}



}