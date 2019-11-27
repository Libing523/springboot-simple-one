package generics;

import java.util.EnumSet;
import java.util.Set;

import generics.watercolors.Watercolors;
import net.mindview.util.Sets;

/**
 * 
    * @ClassName: WatercolorSets
    * @Description: 运算实例，并集，交集，差集等
    *              向Enumset.range()传入某个范围的第一个元素和最后一个元素，然后将它返回一个Set,其中包含该范围内的所有元素
    * @author lishuaibing
    * @date 2019年11月27日 下午1:52:50
    *
 */
public class WatercolorSets {

	public static void main(String[] args) {
		
		/*Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
		Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);*/
		Set<Watercolors> set1 = EnumSet.range(Watercolors.T6, Watercolors.T16);
		Set<Watercolors> set2 = EnumSet.range(Watercolors.T11, Watercolors.T21);
		
		System.out.println("T6-T16 set1:"+set1);
		System.out.println("T11-T21 set2:"+set2);
		
		System.out.println("union(set1,set2):"+Sets.union(set1,set2));
		Set<Watercolors> subset = Sets.intersection(set1, set2);
		System.out.println("intersection:"+subset);
		
		System.out.println("difference(set1, subset):"+Sets.difference(set1, subset));
		System.out.println("difference(set2, subset):"+Sets.difference(set2, subset));
		
		System.out.println("complement:"+Sets.complement(set1, set2));

	}
}
