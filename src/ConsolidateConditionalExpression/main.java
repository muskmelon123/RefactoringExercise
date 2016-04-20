//合并条件表达式
package ConsolidateConditionalExpression;

public class main {
	public static void main(String[] args) {
	}

	private static int test1() {
		int A = 0, B = 0, C = 0;
		/*if (A > 0) {
			return 0;
		}

		if (B > 0) {
			return 0;
		}

		if (C > 0) {
			return 0;
		}

		return 1;*/
		
		//把上面的代码可以变换成下面这种形式,这种是逻辑或。
		if ((A > 0) || (B > 0) || (C > 0)) {
			return 0;
		}
		return 1;
	}
	
	private static int test2() {
		int A = 0, B = 0;
		/*if (A > 0) {
			if (B > 0) {
				return 1;
			}
		}
		return 0;*/
		
		//这种是逻辑与。
		/*if ((A > 0) && (B > 0)) {
			return 1;
		}
		return 0;*/
		
		//最终形式		
		return ((A > 0) && (B > 0)) ? 1 : 0;
	}
}
