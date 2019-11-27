package generics;

/**
 * 
    * @ClassName: CountedObject
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author lishuaibing
    * @date 2019年11月27日 上午10:13:27
    *
 */
public class CountedObject {

	public static long count = 0;
	public final long id = count++;
	public long id() {return id;}
	public String toString() {
		return "CountedObject:"+id;
	}	
}
