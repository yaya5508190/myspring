package bean.annotation.components;

import org.springframework.stereotype.Component;

@Component
@MovieQualifier(genre = "action", format = Format.VSH)
public class ActionVshMovieCatalog extends MovieCatalog {
	public ActionVshMovieCatalog(){
		super.name = "ActionVshMovieCatalog";
	}
}
