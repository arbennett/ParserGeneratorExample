package org.eclipse.ice.example.io;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ice.datastructures.entry.IEntry;
import org.eclipse.ice.datastructures.entry.StringEntry;
import org.eclipse.ice.datastructures.form.DataComponent;
import org.eclipse.ice.example.io.ExampleParserSwitch.ContentWrapper;
import org.eclipse.ice.example.project.Line;
import org.eclipse.ice.example.project.Section;
import org.eclipse.xtext.util.XtextSwitch;

public class ExampleParserSwitch extends XtextSwitch<ContentWrapper<?>> {
	
	/**
	 * Builds a content wrapper for a data component.  Use the translate()
	 * method to extract the data.
	 * 
	 * @param section
	 * @return
	 */
	public ContentWrapper<DataComponent> caseSection(Section content) {
		return new ContentWrapper<DataComponent>(DataComponent.class, content) {
			@Override
			public DataComponent translate() {
				DataComponent c = new DataComponent();
				c.setName(((Section)content).getSectionName());
				return c;
			}
		};
	}
	
	/**
	 * Builds a content wrapper for an entry.  Use the translate()
	 * method to extract the data. 
	 * 
	 * @param line
	 * @return
	 */
	public ContentWrapper<IEntry> caseLine(Line content) {
		return new ContentWrapper<IEntry>(IEntry.class, content) {
			@Override
			public IEntry translate() {
				StringEntry e = new StringEntry();
				Line l = (Line) content;
				e.setName(l.getVarName());
				e.setValue(l.getValue());
				return e;
			}
		};
	}
	

	abstract class ContentWrapper<T> {
		private EObject content;
		private final Class<T> type;
		
		public ContentWrapper(Class<T> t, EObject e) {
			content = e;
			type = t;
		}
	
		public Class<T> getContentType() {
			return type;
		}
		
		abstract T translate();
	}

}
