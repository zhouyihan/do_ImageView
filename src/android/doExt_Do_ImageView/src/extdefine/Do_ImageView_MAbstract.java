package extdefine;

import core.object.DoUIModule;
import core.object.DoProperty;
import core.object.DoProperty.PropertyDataType;


public abstract class Do_ImageView_MAbstract extends DoUIModule{

	protected Do_ImageView_MAbstract() throws Exception {
		super();
	}
	
	/**
	 * 初始化
	 */
	@Override
	public void onInit() throws Exception{
        super.onInit();
        //注册属性
		this.registProperty(new DoProperty("cache", PropertyDataType.String, "never", true));
		this.registProperty(new DoProperty("enabled", PropertyDataType.Bool, "false", false));
		this.registProperty(new DoProperty("radius", PropertyDataType.Number, "0", true));
		this.registProperty(new DoProperty("scale", PropertyDataType.String, "fillxy", true));
		this.registProperty(new DoProperty("source", PropertyDataType.String, "", false));
	}
}