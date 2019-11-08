package polymorphism;


/**
 * 
    * @ClassName: RTTI
    * @Description: 向下转型与运行时类型识别
    * 向上转型是安全的，基类的不会具有大于导出类的接口，向下转型需要检查，可能出现的异常为：ClassCastException
    * @author lishuaibing
    * @date 2019年11月8日 上午9:30:55
    *
 */
class Useful{
	public void f() {}
	public void g() {}
}

class MoreUseful extends Useful{
	public void f() {}
	public void g() {}
	public void u() {}
	public void v() {}
	public void w() {}
}



public class RTTI {

	public static void main(String[] args) {
		Useful[] x = {
			new Useful(),
			new MoreUseful(),
		};
		x[0].f();
		x[1].g();
		//((MoreUseful)x[1]).u();
		//((MoreUseful)x[0]).u();

	}

}
