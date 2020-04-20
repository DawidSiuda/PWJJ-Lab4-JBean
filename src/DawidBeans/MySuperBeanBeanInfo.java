package DawidBeans;

import java.awt.Image;
import java.beans.BeanInfo;
import java.beans.SimpleBeanInfo;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MySuperBeanBeanInfo extends SimpleBeanInfo {

	public Image getIcon(int iconType) {
		String name = "";
		if (iconType == BeanInfo.ICON_COLOR_16x16)
			name = "COLOR_16x16";
		else if (iconType == BeanInfo.ICON_COLOR_32x32)
			name = "COLOR_32x32";
		else if (iconType == BeanInfo.ICON_MONO_16x16)
			name = "MONO_16x16";
		else if (iconType == BeanInfo.ICON_MONO_32x32)
			name = "MONO_32x32";
		else
			return null;
		Image im = null;
		try {
			im = ImageIO.read(MySuperBeanBeanInfo.class.getClassLoader().getResourceAsStream("MyBean_" + name + ".gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return im;
	}
}
