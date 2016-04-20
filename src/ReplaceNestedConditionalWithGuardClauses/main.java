//这个就是以卫语句取代嵌套条件表达式。
package ReplaceNestedConditionalWithGuardClauses;

public class main {
	public static void main(String[] args) {
		allTest(-2);
	}

	private static void allTest(int flag) {
		System.out.println(test1(flag));
		System.out.println(testRefactoring1(flag));
	}
	
	private static int test1(int flag) {
		int result;
		if (flag > 100) {
			result = 1;
		} else if (flag <= 100 && flag >0) {
			result = 2;
			if (flag < 50) {
				result = 3;
			}
		} else {
			result = 4;
		}
		return result;
	}
	
	//注意：这就是把条件选择变成卫语句的做法，卫语句是默认只有一种情况是正常的，即return 3，其他情况都是不常见行为。
	//如果遇到flag < 50的情况，就是嵌套if的情况，就先把它转成if-else，然后把if()给提出来，然后else继续分拆。
	private static int testRefactoring1(int flag) {
		if (flag > 100) {
			return 1;
		}
		
		if (flag > 100 || flag <= 0) {
			return 4;
		}
		
		if (flag < 50) {
			return 3;
		}
		
		return 2;
	}
	
	
}
