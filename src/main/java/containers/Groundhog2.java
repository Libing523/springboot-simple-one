package containers;

/**
 * 
    * @ClassName: Groundhog2
    * @Description: 默认的Object.equals()只是比较对象的地址，所以一个Groundhog(3)并不等于另一个Groundhog(3)
    *               如果要使用自己的类作为HashMap的键，必须同时重载hashCode()和equals();
    * @author lishuaibing
    * @date 2019年12月16日 上午9:02:16
    *
 */
public class Groundhog2 extends Groundhog {

	public Groundhog2(int n) {
		super(n);
	}
	
	
	public int hashCode() {
		return number;
	}

	public boolean equals(Object o) {
		return o instanceof Groundhog2 && (number == ((Groundhog2)o).number);
	}
		
}
