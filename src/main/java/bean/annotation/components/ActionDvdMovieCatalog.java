package bean.annotation.components;

import org.springframework.stereotype.Component;

@Component
@MovieQualifier(genre = "action", format = Format.DVD)
public class ActionDvdMovieCatalog extends MovieCatalog {
	public ActionDvdMovieCatalog(){
		super.name = "ActionDvdMovieCatalog";
	}
}
