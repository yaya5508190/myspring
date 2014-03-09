package bean.propertyEditors;

import java.beans.PropertyEditorSupport;

public class ExoticTypeEditor extends PropertyEditorSupport {

	public void setAsText(String text) {
		setValue(new ExoticType(text.toUpperCase()));
	}
}