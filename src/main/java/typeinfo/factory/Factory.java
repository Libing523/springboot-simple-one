package typeinfo.factory;

/**
 * 
 * @ClassName: Factory
 * @Description: 工厂方法设计模式，将对象的创建工作交给类自己去创建
 * @author lishuaibing
 * @date 2019年11月18日 下午2:52:20
 *
 * @param <T>
 */
public interface Factory<T> {
	T create();
}
