package interfaces.interfaceprocessor;

import interfaces.filters.BandPass;
import interfaces.filters.Filter;
import interfaces.filters.HighPass;
import interfaces.filters.LowPass;
import interfaces.filters.Waveform;

/**
 * 
    * @ClassName: FilterAdapter
    * @Description: 9.3使用适配器设计模式，适配器中的代码将接受你所拥有的的接口，并产生你所需要的接口
    * @author lishuaibing
    * @date 2019年11月11日 上午9:19:32
    *
 */
class FilterAdapter implements Processor {

	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}
	
	@Override
	public Waveform process(Object input) {

		return filter.process((Waveform) input);
	}

}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
	/**执行结果：
	 *  Using Processor LowPass
		Waveform0
		Using Processor HighPass
		Waveform0
		Using Processor BandPass
		Waveform0
	 */
}
