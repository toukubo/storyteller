package net.enclosing.util;

import static com.monitorjbl.json.Match.match;

import java.util.Collection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.monitorjbl.json.JsonView;
import com.monitorjbl.json.JsonViewSerializer;

import antlr.collections.List;
import net.storyteller.model.AttrImpl;
import net.storyteller.model.NounImpl;

public class JSONUtil {

	// static {
	// JsonView.with(list).onClass(Noun.class, match().exclude("contains"));
	// }

	public static String toJSON(Object o) {
		
		if (o == null) {
			return null;
		}

		try {

			String jsonString = null;
			
			ObjectMapper mapper = new ObjectMapper();

			JsonView<Object> jsonView = newJSONView(o); // get the json view for the
												// specific object
			if (jsonView != null) {
				SimpleModule module = new SimpleModule();
				module.addSerializer(JsonView.class, new JsonViewSerializer());
				mapper.registerModule(module);
				jsonString = mapper.writeValueAsString(jsonView);
			} else { // uses the default object mapper without the json view
				jsonString = mapper.writeValueAsString(o);
			}
			return jsonString;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return null;
	}

	// needs to be improved using design pattern factory or so for now simple
	// methods with ifs
	private static JsonView<Object> newJSONView(Object o) {

		Class<?> objClass = null;

		if (o instanceof Collection) {
			Collection c = (Collection) o;
			if (!c.isEmpty()) {
				Object firstObject = c.iterator().next();
				objClass = firstObject.getClass();
			}
		} else {
			objClass = o.getClass();
		}

		System.out.println("objClass:" + objClass + " --- " + objClass.equals(NounImpl.class));

		if (objClass != null && objClass.equals(NounImpl.class)) {
			JsonView<Object> jsonView = JsonView.with(o)
					.onClass(NounImpl.class, match().exclude("nounUses", "j2eeStory"))
					.onClass(AttrImpl.class, match().exclude("noun", "attrUses", "causalRelation"));
			return jsonView;
		}
		return null;
	}
}
